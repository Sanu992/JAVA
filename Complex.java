package day3;

import java.util.Scanner;

public class Complex {
	
	public static int reverse(int n) {
		int rev=0;
		while(n!=0) {
		    int last=n%10;
		    rev=rev*10+last;
			n/=10;	
		}
		return rev;
	}
	
	public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
	
	public static void isNeon(int n) {
		int sum=0;
		int square=n*n;
		while(square>0) {
			int last=square%10;
			sum=sum+last;
			square/=10;
		}
		if(n==sum) {
			System.out.println("Neon");
		}
		else {
			System.out.println("Not Neon");
		}
	}
	
	public static void isHarshad(int n) {
	        int sum = sumDigits(n);
	        if (n % sum == 0)
	            System.out.println("Harshad Number");
	        else
	            System.out.println("Not a Harshad Number");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		 int rev = reverse(n);
	      int sum = sumDigits(rev);

	        System.out.println("Reversed Number = " + rev);
	        System.out.println("Sum of Digits = " + sum);

	        if (sum >= 10) {
	            isHarshad(sum);
	        } else {
	            isNeon(sum);
	        }

	}

}
