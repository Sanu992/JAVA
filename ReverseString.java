package string_day5;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String res="";
//		for(int i=0;i<=s.length()-1;i++) 
//		{
//			char c=s.charAt(i);
//			res=c+res;
//			
//		}
		for(int i=s.length()-1;i>=0;i--) 
			{
				char c=s.charAt(i);
				res=res+c;
				
			}
		System.out.println(res);
		
		if(res.endsWith(s))
		{
			System.out.println("It is a Palindrome");
		}
		else 
		{
			System.out.println("It is not Palindrome");
		}
	}

}
