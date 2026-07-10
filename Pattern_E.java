package pattern;

public class Pattern_E {

	public static void main(String[] args) {
		int rows = 5; // Must be an odd number for a symmetrical middle line
        int cols = 5;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Condition to print stars for the letter E
                if (i == 0 || i == rows - 1 || i == cols / 2 || j == 0) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after completing each row
            System.out.println();
	}

}
}
