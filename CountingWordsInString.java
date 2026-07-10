package string_day5;

import java.util.Scanner;

public class CountingWordsInString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
	    String s = scanner.nextLine();
	    int count=0;
	    for(int i=0;i<=s.length()-1;i++) 
	    {
	    	char c=s.charAt(i);
	    	if(c==' ')
	    	{
	    		count++;
	    	}
	    }
	    count++;
	    System.out.println(count);
	}

}
