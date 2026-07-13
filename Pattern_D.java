package pattern;

import java.util.Scanner;

public class Pattern_D {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = sc.nextInt(); 
		System.out.println("Enter number of columns");							// Must be an odd number for a symmetrical middle line
        int cols = sc.nextInt();

        for (int i = 1; i <=rows; i++) {
            for (int j = 1; j <=cols; j++) {
                // Condition to print stars for the letter D
                if (i == 1 && j!=cols || j == 1 ||i==rows && j!=cols ||j==cols && i!=1 &&i!=rows) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            // Move to the next line after completing each row
            System.out.println();

	}

  }
}
