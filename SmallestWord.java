package string_day5_day6;

import java.util.Scanner;

public class SmallestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s =  sc.nextLine();
        String word="";
        String small=s;
        for(int i=0;i<=s.length()-1;i++) {
        	char c=s.charAt(i);
        	if(c!=' ') {
        		word+=c;
        	}
        	else 
        	{
        		if(word.length() < small.length()) 
        		{
        			small = word;
        		}
        		word="";
        	}
        }
        if(word.length() < small.length()) 
        {
        	small = word;
        }
        
       System.out.println("Smallest word is: " + small);
       sc.close();
	}

}
