import java.util.Scanner;

public class theplank{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] f = new long[n + 1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            if (i >= 1) {
                f[i] += f[i - 1];
            }
            if (i >= 2) {
                f[i] += f[i - 2];
            }
            if (i >= 3) {
                f[i] += f[i - 3];
            }
        }
        scanner.close();
        System.out.println(f[n]);
    }
}