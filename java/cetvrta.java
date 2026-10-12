
import java.util.Scanner;

public class cetvrta{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size =  3;
        int[] xcoords = new int[size];
        int[] ycoords = new int[size];
        
        for(int i = 0; i < (size * 2); i++){
            if(i % 2 == 0){
                xcoords[i / 2] = s.nextInt();
            } else{
                ycoords[i / 2] = s.nextInt();
            }
        }

        int x = distinct(xcoords);
        int y = distinct(ycoords);
        System.out.println(x + " " + y);
        s.close();
    }

    public static int distinct(int[] arr){
        int count1 = 0;
        int memo1 = 0;
        int count2 = 0; 
        int memo2 = 0;

        for(int curr : arr){
            if((curr == memo1) || (memo1 == memo2)){
                memo1 = curr;
                count1++;
            } else{
                memo2 = curr;
                count2++;
            }
        }

        if(count1 > count2){
            return memo2;
        } else{
            return memo1;
        }
    }
}
