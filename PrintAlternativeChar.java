package string_day5;

import java.util.Scanner;

public class PrintAlternativeChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        System.out.println("Alternate characters are:");

        for (int i = 0; i < s.length()-1; i = i + 2) {
            char c = s.charAt(i);
            System.out.print(c);
        }
	}

}
