package string_day5;

import java.util.Scanner;

public class InsertCharStartANDEnd {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        System.out.println("Enter start chracter");
        char start=scanner.next().charAt(0);
        System.out.println("Enter end chracter");
        char end=scanner.next().charAt(0);
        // add start an end to s
        String res=start + s + end;
        System.out.println(res);
	}

}
