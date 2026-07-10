package home2;
import java.util.*;
public class SumEvenOddDigits {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int evenSum = 0;
	        int oddSum = 0;

	        while (num > 0) {
	            int digit = num % 10;

	            if (digit % 2 == 0)
	                evenSum += digit;
	            else
	                oddSum += digit;

	            num = num / 10;
	        }

	        System.out.println("Sum of Even Digits = " + evenSum);
	        System.out.println("Sum of Odd Digits = " + oddSum);
	    }
}
