
import java.util.Scanner;
public class whichisgreater {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numout = 0;
        int a = s.nextInt();
        int b = s.nextInt();

        if(a > b){
            numout = 1;
        }

        System.out.println(numout);
        s.close();
    }        
}
