package home2;
import java.util.*;
public class CaprekarNumber {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int square = num * num;
        String str = String.valueOf(square);

        int len = str.length();

        String left = str.substring(0, len / 2);
        String right = str.substring(len / 2);

        int leftNum = left.isEmpty() ? 0 : Integer.parseInt(left);
        int rightNum = right.isEmpty() ? 0 : Integer.parseInt(right);

        if (leftNum + rightNum == num)
            System.out.println(num + " is a Caprekar Number");
        else
            System.out.println(num + " is Not a Caprekar Number");
    }
}
