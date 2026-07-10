package pattern;

public class Pattern_A {

	public static void main(String[] args) {
		// Height of the letter A
        int height = 5; 
        // Width of the letter A
        int width = 5;  

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                // Print stars for the outer sides or the horizontal middle bridge
                if (((j == 0 || j == width - 1) && i != 0) || // Left & Right vertical lines (except top corner)
                    (i == 0 && j > 0 && j < width - 1) ||     // Top horizontal line (except corners)
                    (i == height / 2)) {                      // Middle horizontal bridge
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to the next line after completing a row
            System.out.println();
        }
	}

}
