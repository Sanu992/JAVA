package string_day5_day6;

import java.util.Scanner;

public class PrintFirstNonRepeatCharacter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the string");
	     String s = sc.nextLine();
	     for(int i=0;i<=s.length()-1;i++)
	     {
	    	 char c=s.charAt(i);
	    	 int count=0;
	    	 for(int j=0;j<=s.length()-1;j++)
	    	 {
	    		 if(s.charAt(j)==c) 
	    		 {
	    			 count++;
	    		 }
	    	 }
	    	 if(count==1)
	    	 {
	    		 System.out.print(c);
	    		 break;
	    	 }
	     }
	}

}
