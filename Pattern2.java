package pattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        int num=1;
        System.out.print("Enter rows ");
        int rows = scanner.nextInt();
        System.out.println("Enter columns");
        int columns = scanner.nextInt();
        
        for(int i=1;i<=rows;i++) {
        	for(int j=1;j<=columns;j++) {
        		System.out.print(num+" ");
        		num++;
        	}
        	System.out.println();
        }

	}

}
