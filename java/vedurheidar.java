
import java.util.Scanner;

public class vedurheidar{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int windspeed = s.nextInt();
        int roads = s.nextInt(); 

        StringBuilder str = new StringBuilder("");

        for(int i = 0; i < roads; i++){
            String roadname = s.next();
            int roadwindspeed = s.nextInt();

            if(windspeed > roadwindspeed){
                System.out.println(roadname + " lokud");
            } else{
                System.out.println(roadname + " opin");
            }
        }

        System.out.println(str);
        s.close();
    }
}
