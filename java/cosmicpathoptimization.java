
import java.util.Scanner;

public class cosmicpathoptimization{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int readings = s.nextInt();
        int totaltemp = 0;
        double meantemp = 0;

        for(int i = 0; i < readings; i++){
            totaltemp += s.nextInt();
        }

        meantemp = Math.floor( totaltemp / readings );

        System.out.println((int)meantemp);
        s.close();
    }
}