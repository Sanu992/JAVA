package pattern_day5;

import java.util.Scanner;

public class ReverseEquliTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows=sc.nextInt();
		int space=0;
		int stars=(rows*2)-1;
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=stars;k++) 
			{
				System.out.print("* ");
			}
			System.out.println();
			stars=stars-2;
			space++;
		}
		sc.close();
	}

}
