package home2;
import java.util.*;
public class ArrangeDigits {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String num = sc.next();

        char[] digits = num.toCharArray();

        Arrays.sort(digits);

        System.out.print("Ascending : ");
        for (char d : digits)
            System.out.print(d);

        System.out.println();

        System.out.print("Descending : ");
        for (int i = digits.length - 1; i >= 0; i--)
            System.out.print(digits[i]);
    }
}

