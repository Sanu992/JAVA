package home2;
import java.util.*;
public class CountEvenOddDigits {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int even = 0;
        int odd = 0;

        while (num > 0) {
            int digit = num % 10;

            if (digit % 2 == 0)
                even++;
            else
                odd++;

            num = num / 10;
        }

        System.out.println("Even Digits = " + even);
        System.out.println("Odd Digits = " + odd);
    }
}

