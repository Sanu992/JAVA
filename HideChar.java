package string_day5;
import java.lang.*;
import java.util.Scanner;
public class HideChar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
	    String s = scanner.nextLine();
		
		for(int i=0;i<6;i++) 
		{
			char c=s.charAt(i);
			System.out.print('x');
		}
		for(int i=7;i<=s.length()-1;i++) {
			char c=s.charAt(i);
			System.out.print(c);
		}

	}

}
