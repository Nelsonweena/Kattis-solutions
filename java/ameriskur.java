
import java.util.Scanner;

public class ameriskur {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int input =s.nextInt();
        double toKm = 0.09144;

        System.out.println(input * toKm);
        s.close();
    }
}
