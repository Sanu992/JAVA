package pattern;

import java.util.Scanner;

public class Pattern4 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter rows ");
    int rows = scanner.nextInt();
    System.out.print("Enter columns");
    int columns = scanner.nextInt();
    
    for(int i=1;i<=rows;i++) {
    	
    	for(int j=1;j<=columns;j++) {
    		if(i%2==0) {
    		System.out.print("@");
    		}
    		else {
    			System.out.print("*");
    		}
    	
    }
    	System.out.println();	
    }
    
}
}

