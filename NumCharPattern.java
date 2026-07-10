package pattern_day5;

import java.util.Scanner;

public class NumCharPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			char c='a';
			int num=1;
			for(int j=1;j<=i;j++) {
				if(i%2==0) 
					System.out.print(c++ +" ");
				
				else 
					System.out.print(num++ +" ");
				
			
			}
			System.out.println();
			
		}
	}

}
