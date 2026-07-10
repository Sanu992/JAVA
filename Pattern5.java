package pattern;
import java.util.*;
public class Pattern5 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
	    System.out.print("Enter rows:");
	    int rows = scanner.nextInt();
	    System.out.print("Enter columns:");
	    int columns = scanner.nextInt();
	    
	    for(int i=1;i<=rows;i++) {
	    	
	    	for(int j=1;j<=columns;j++) {
	    		if((i+j)==rows+1||i==j||i==1 || j==1 || i==rows || j==columns|| i==rows/2+1 || j==columns/2+1 ) {
	    			System.out.print("* ");
	    		}
	    		else {
	    			System.out.print("  ");
	    		}
	    	System.out.println();
	    }
	}

}
}