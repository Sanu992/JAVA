package string_day5;

import java.util.Scanner;

public class RemoveStartANDEndSpace {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();

        //Find first non-space character
        int start=0;
        int end=s.length()-1;
        while (start <= end && s.charAt(start) == ' ') {
            start++;
        }

        // Find last non-space character
        while (end >= start && s.charAt(end) == ' ') {
            end--;
        }

        String res = "";

        for (int i = start; i <= end; i++) {
            res += s.charAt(i);
        }

        System.out.println("After removing starting and ending spaces:");
        System.out.println(res);

        scanner.close();
	}

}
