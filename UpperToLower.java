package string_day5;

import java.util.Scanner;

public class UpperToLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
	    String s = scanner.nextLine();
		String res="";
		for(int i=0;i<=s.length()-1;i++) 
	    {
	    	char c=s.charAt(i);
	    	if(c>='A'&& c<='Z')
	    	{
	    		res=res+(char)(c+32);
	    	}
	    	else
	    	{
	    		res+=c;
	    	}
	    }
		System.out.println(res);
	}
}
