package string_day5;

import java.util.Scanner;

public class RemoveFirstLastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        String res = "";
        
        for(int i=1;i<=s.length()-2;i++) {
        	res=res+s.charAt(i);
        }
       System.out.println(res); 
       scanner.close();

	}
	
	
}
