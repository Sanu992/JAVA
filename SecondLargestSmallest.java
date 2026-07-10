package home2;
import java.util.*;
public class SecondLargestSmallest {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        int largest = -1, secondLargest = -1;
	        int smallest = 10, secondSmallest = 10;

	        while (num > 0) {
	            int digit = num % 10;

	            if (digit > largest) {
	                secondLargest = largest;
	                largest = digit;
	            } else if (digit != largest && digit > secondLargest) {
	                secondLargest = digit;
	            }

	            if (digit < smallest) {
	                secondSmallest = smallest;
	                smallest = digit;
	            } else if (digit != smallest && digit < secondSmallest) {
	                secondSmallest = digit;
	            }

	            num = num / 10;
	        }

	        System.out.println("Second Largest = " + secondLargest);
	        System.out.println("Second Smallest = " + secondSmallest);
	    }
	}

