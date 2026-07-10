package pattern_day5;

import java.util.Scanner;

public class DiamondPattern {

	   public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the number of rows:");
	        int rows = sc.nextInt();

	        // Upper Half
	        int space = rows - 1;
	        int stars = 1;

	        for (int i = 1; i <= rows; i++) {

	            for (int j = 1; j <= space; j++) {
	                System.out.print("  ");
	            }

	            for (int k = 1; k <= stars; k++) {
	                System.out.print("* ");
	            }

	            System.out.println();

	            space--;
	            stars = stars + 2;
	        }

	        // Lower Half
	        space = 1;
	        stars = stars - 4;

	        for (int i = 1; i < rows; i++) {

	            for (int j = 1; j <= space; j++) {
	                System.out.print("  ");
	            }

	            for (int k = 1; k <= stars; k++) {
	                System.out.print("* ");
	            }

	            System.out.println();

	            space++;
	            stars = stars - 2;
	        }
	        sc.close();
	    }  
}

