package string_day5_day6;

import java.util.Scanner;

public class StringAllWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s =  sc.nextLine().toLowerCase();
        String word="";
        int flag=0;
        for(int i=0;i<=s.length()-1;i++) {
        	char c=s.charAt(i);
        	if(!(c>='a'&& c<='z')) {
//        		flag=1;
//        		System.out.println("It doesn't contain only numbers");
//        		return;
        		continue;
        	}
        	else {
        		System.out.println("It contains only alphabets");
        		return;
        	}
        }
      
    	System.out.println("It contains only numbers");

	}

}

