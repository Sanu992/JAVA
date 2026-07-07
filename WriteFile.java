package proj;
import java.io.*;
public class WriteFile {

	public static void main(String[] args)throws Exception {
		 FileOutputStream fout = new FileOutputStream("Sample.txt");

	        String text = "I am jeevith ,i love sushi";
	        fout.write(text.getBytes());

	        fout.close();
	        System.out.println("Data written successfully.");

	}

}
