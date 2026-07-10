package pattern_day5;

import java.util.Scanner;

public class CharTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++) {
			char c='a';
			for(int j=1;j<=i;j++) {
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}
	}

}
