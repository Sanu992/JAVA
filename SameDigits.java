package home2;
import java.util.*;
public class SameDigits {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int lastDigit = num % 10;
        boolean same = true;

        while (num > 0) {

            if (num % 10 != lastDigit) {
                same = false;
                break;
            }

            num = num / 10;
        }

        if (same)
            System.out.println("All digits are same.");
        else
            System.out.println("Digits are not same.");
    }
}
