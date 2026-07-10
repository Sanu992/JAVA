package string_day5;
import java.util.*;
public class RemoveSpaces {

	public static void main(String[] args) {
		
				Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter a string:");
		        String s = scanner.nextLine();

		        String res = "";

		        for (int i = 0; i < s.length(); i++) {

		            char c = s.charAt(i);

		            if (c != ' ') {
		                res = res + c;
		            }
		        }

		        
		        System.out.println(res);

		        scanner.close();
		    }
		

	}


