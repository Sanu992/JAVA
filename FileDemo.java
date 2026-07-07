package proj;
import java.io.*;
class FileDemo {
	 public static void main(String[] args) throws IOException {

	        // Write to sample.txt
	        FileOutputStream fout = new FileOutputStream("Sample.txt");
	        String text = "I am writer";
	        fout.write(text.getBytes());
	        fout.close();

	        System.out.println("Data written successfully.");

	        // Read from sample.txt
	        FileInputStream fin = new FileInputStream("Sample.txt");
	        int ch;

	        System.out.println("File Content:");
	        while ((ch = fin.read()) != -1) {
	            System.out.print((char) ch);
	        }

	        fin.close();
	    }
	}

