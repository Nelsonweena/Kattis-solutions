import java.util.Scanner;

public class videospeedup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read inputs for n, p, k
        int n = sc.nextInt();
        int p = sc.nextInt();
        int k = sc.nextInt();

        // Read the array y
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        double s = 0.0;
        double m = 1.0;
        double ans = 0.0;

        // Process the array y
        for (int t : y) {
            ans += m * (t - s);
            s = t;
            m += p / 100.0;
        }

        // Add the last segment
        ans += m * (k - s);

        // Print the result with 6 decimal places
        System.out.printf("%.6f%n", ans);

        sc.close();
    }
}
