package string_day5;

import java.util.Scanner;

public class VowelString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
	    String s = scanner.nextLine();
	    for(int i=0;i<=s.length()-1;i++) 
	    {
	    	char c=s.charAt(i);
	    	if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ) {
	    		System.out.println(c);
	    	}
	    }
	}

}
