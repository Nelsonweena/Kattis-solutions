
import java.util.Scanner;

public class commercials {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        int price = sc.nextInt();
        int[] inputs = new int[cases];

        for(int i = 0; i < cases; i++){
            inputs[i] = sc.nextInt() - price;
        }
        
        // Kadane's algorithm without Math.max
        int max = Integer.MIN_VALUE; // Start with the smallest possible value
        int count = 0;

        for (int i = 0; i < cases; i++) {
            if (count + inputs[i] > inputs[i]) {
                // Extend the current subarray
                count = count + inputs[i];
            } else {
                // Start a new subarray
                count = inputs[i];
            }

            // Update global maximum if needed
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max);
        sc.close();
    }
}
