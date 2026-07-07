package proj;
import java.io.*;
public class ReadFile {
	public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("Sample.txt");

        int ch;
        while ((ch = fin.read()) != -1) {
            System.out.print((char) ch);
        }

        fin.close();
    }
}
