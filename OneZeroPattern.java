package pattern_day5;

import java.util.Scanner;

public class OneZeroPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int rows=sc.nextInt();
		
		for(int i=1;i<=rows;i++) {
			int num1=0;
			int num2=1;
			for(int j=1;j<=i;j++) {
				if(i%2==0) 
					System.out.print(num1 +" ");
				
				else 
					System.out.print(num2 +" ");
				
			
			}
			System.out.println();
			if(i%2==0) {
				num1++;
			}
			else {
				num2++;
			}
	}
	}

}
