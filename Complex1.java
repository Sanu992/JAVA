package day3;
import java.util.*;
public class Complex1 {
	// Method to check Prime
    static boolean isPrime(int n) {
        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Method to reverse a number
    static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev;
    }

    // Method to check Automorphic
    static boolean isAutomorphic(int n) {
        int square = n * n;
        int temp = n;

        while (temp > 0) {
            if (temp % 10 != square % 10)
                return false;

            temp = temp / 10;
            square = square / 10;
        }

        return true;
    }
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {

            System.out.println(n + " is a Prime Number.");

            int rev = reverse(n);

            if (isPrime(rev))
                System.out.println(n + " is also a Twisted Prime Number.");
            else
                System.out.println(n + " is not a Twisted Prime Number.");

        } else {

            System.out.println(n + " is not a Prime Number.");

            if (isAutomorphic(n))
                System.out.println(n + " is an Automorphic Number.");
            else
                System.out.println(n + " is not an Automorphic Number.");
        }

        sc.close();
    }

}
