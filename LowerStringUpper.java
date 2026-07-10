package string_day5;

import java.util.Scanner;

public class LowerStringUpper {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
	    String s = scanner.nextLine();
		String res="";
		for(int i=0;i<=s.length()-1;i++) 
	    {
	    	char c=s.charAt(i);
	    	if(c>='a'&& c<='z')
	    	{
	    		res=res+(char)(c-32);
	    	}
	    	else
	    	{
	    		res+=c;
	    	}
	    }
		System.out.println(res);

}
}
