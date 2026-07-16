import streamlit as st
import ollama
from langchain_text_splitters import RecursiveCharacterTextSplitter
from pdf_reader import read_pdf

# -------- Chunking --------
def chunk_text(text):
    splitter = RecursiveCharacterTextSplitter(
        chunk_size=500,
        chunk_overlap=50
    )
    return splitter.split_text(text)

# -------- Summarize --------
def summarize_chunk(chunk):
    prompt = f"""
Summarize the following lecture text into short bullet points:

{chunk}
"""
    response = ollama.chat(
        model="tinyllama",
        messages=[{"role": "user", "content": prompt}]
    )
    return response["message"]["content"]

# -------- Combine --------
def combine_summaries(summaries):
    final_prompt = f"""
Convert these into clean bullet-point lecture notes:

{summaries}
"""
    response = ollama.chat(
        model="tinyllama",
        messages=[{"role": "user", "content": final_prompt}]
    )
    return response["message"]["content"]

# -------- UI --------
st.set_page_config(page_title="Lecture Summarizer")

st.title("📚 Lecture Notes Summarizer")

option = st.radio("Choose Input Type:", ["Text", "PDF"])

text = ""

if option == "Text":
    text = st.text_area("Paste Lecture Text Here")

elif option == "PDF":
    uploaded_file = st.file_uploader("Upload PDF", type="pdf")
    if uploaded_file:
        with open("temp.pdf", "wb") as f:
            f.write(uploaded_file.read())
        text = read_pdf("temp.pdf")

if st.button("Generate Summary"):

    if text.strip() == "":
        st.warning("Please provide input!")
    else:
        with st.spinner("Processing..."):
            chunks = chunk_text(text)

            summaries = []
            for chunk in chunks:
                summaries.append(summarize_chunk(chunk))

            final = combine_summaries(summaries)

        st.success("Done!")

        st.subheader("📌 Summary")
        st.write(final)