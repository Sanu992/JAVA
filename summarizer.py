import ollama

from langchain_text_splitters import RecursiveCharacterTextSplitter

from pdf_reader import read_pdf

# ---------- Load text ----------

def load_text():

    choice = input("Enter 1 for TXT, 2 for PDF: ")

    if choice == "1":
        with open("lecture.txt", "r", encoding="utf-8") as f:
            text = f.read()

    elif choice == "2":
        path = input("Enter PDF path: ")
        text = read_pdf(path)

    else:
        print("Invalid")
        return ""

    return text


# ---------- Chunk text ----------

def chunk_text(text):

    splitter = RecursiveCharacterTextSplitter(
        chunk_size=500,
        chunk_overlap=50
    )

    chunks = splitter.split_text(text)

    return chunks


# ---------- Summarize chunk ----------

def summarize_chunk(chunk):

    prompt = f"""
Summarize the following lecture text into short bullet points.

Text:
{chunk}

Summary:
"""

    response = ollama.chat(
        model="tinyllama",
        messages=[
            {"role": "user", "content": prompt}
        ]
    )

    return response["message"]["content"]


# ---------- Combine summaries ----------

def combine_summaries(summaries):

    final_prompt = f"""
Combine these summaries into clear lecture notes
Use bullet points.

Summaries:
{summaries}
"""

    response = ollama.chat(
        model="tinyllama",
        messages=[
            {"role": "user", "content": final_prompt}
        ]
    )

    return response["message"]["content"]


# ---------- Main ----------

def main():

    text = load_text()

    chunks = chunk_text(text)

    print("Total chunks:", len(chunks))

    summaries = []

    for i, chunk in enumerate(chunks):

        print("Summarizing chunk", i+1)

        s = summarize_chunk(chunk)

        summaries.append(s)

    final = combine_summaries(summaries)

    print("\n===== FINAL NOTES =====\n")
    print(final)


if __name__ == "__main__":
    main()