import java.util.Scanner;

public class herman {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        double r =  Double.valueOf(sc.next());
        double area = r*r*Math.PI;
        double nonse = 2*r*r;
        System.out.println(String.format("%.6f", area));
        System.out.println(String.format("%.6f", nonse));
        sc.close();
    }
}
