
import java.util.Scanner;

public class sibice{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int matches = s.nextInt();
        int width = s.nextInt();
        int height = s.nextInt();

        int diagdist = (int)Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));

        for(int i = 0; i < matches; i++){
            int matchlen = s.nextInt();
            if((matchlen <= height) || (matchlen <= width) || (matchlen <= diagdist)){
                System.out.println("DA");
            } else{
                System.out.println("NE");
            }
        }
        s.close();
    }
}