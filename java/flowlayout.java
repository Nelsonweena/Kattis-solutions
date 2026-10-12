import java.util.Scanner;

public class flowlayout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int m = sc.nextInt(); // Read maximum width
            if (m == 0) {
                break; // End of input
            }

            int currentWidth = 0; // Current row width
            int currentHeight = 0; // Current row height
            int maxWidth = 0; // Maximum width of the window
            int totalHeight = 0; // Total height of the window

            while (true) {
                int w = sc.nextInt(); // Read rectangle width
                int h = sc.nextInt(); // Read rectangle height
                if (w == -1 && h == -1) {
                    // Output the final dimensions
                    System.out.println(maxWidth + " x " + (totalHeight + currentHeight));
                    currentWidth = 0; // Reset current width
                    currentHeight = 0; // Reset current height
                    maxWidth = 0; // Reset maximum width
                    totalHeight = 0; // Reset total height
                    break; // Break to read the next dataset
                }

                // Check if the rectangle can fit in the current row
                if (currentWidth + w <= m) {
                    currentWidth += w; // Add width to current row
                    currentHeight = Math.max(currentHeight, h); // Update row height
                } else {
                    totalHeight += currentHeight; // Move to next row
                    currentWidth = w; // Start new row with current rectangle width
                    currentHeight = h; // Start new row with current rectangle height
                }

                // Update maximum width encountered
                maxWidth = Math.max(maxWidth, currentWidth);
            }
        }

        sc.close(); // Close the scanner
    }
}