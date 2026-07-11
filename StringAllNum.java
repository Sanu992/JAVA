package string_day5_day6;

import java.util.Scanner;

public class StringAllNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s =  sc.nextLine();
        String word="";
        int flag=0;
        for(int i=0;i<=s.length()-1;i++) {
        	char c=s.charAt(i);
        	if(!(c>='0'&& c<='9')) {
        		flag=1;
        		System.out.println("It doesn't contain only numbers");
        		return;
        	}
        }
        if(flag==0) {
    	  System.out.println("It contains only numbers");
      }

    }
}
