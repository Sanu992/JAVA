package home2;
import java.util.*;
public class CountPrimeDigits {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int count = 0;

	        while (num > 0) {
	            int digit = num % 10;

	            if (digit == 2 || digit == 3 || digit == 5 || digit == 7)
	                count++;

	            num = num / 10;
	        }

	        System.out.println("Prime Digits = " + count);
	    }
}
