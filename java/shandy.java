
import java.util.Scanner;

public class shandy{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int beer = s.nextInt();
        int lemonade = s.nextInt();
        int lesser = 0;
        if(beer < lemonade){
            lesser = beer;
        } else{
            lesser = lemonade;
        } 
        System.out.println(lesser * 2);
        s.close();
    }
}