
import java.util.Scanner;

public class decimaldeletion{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double input = s.nextDouble();
        long rounded = Math.round(input);

        System.out.println(rounded);
        s.close();
    }
}