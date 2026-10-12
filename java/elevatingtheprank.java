import java.util.Scanner;

public class elevatingtheprank{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int origin = sc.nextInt();
        int dest = sc.nextInt();
        int totalfloor = sc.nextInt();

        if(origin > dest){
            int temp = origin;
            origin = dest;
            dest = temp;
        }
        
        int stops = 0;
        int travelled = dest - origin;

        for(int i = 0; i < totalfloor; i++){
            int curr = sc.nextInt();
            if((origin < curr) && (curr < dest) ){
                stops++;
            }
        }

        int seconds = (stops * 10) + (travelled * 4);
        System.out.println(seconds);
        sc.close();;
    }
}