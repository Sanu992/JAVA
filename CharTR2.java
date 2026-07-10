package pattern_day5;

import java.util.Scanner;

public class CharTR2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int rows=sc.nextInt();
		char c='a';
		for(int i=1;i<=rows;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				
			}
			System.out.println();
			c++;
		}

	}

}
