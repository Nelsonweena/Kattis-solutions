
import java.util.Scanner;

public class reversebinary1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int original = s.nextInt();
        int start = 1;
        int size = 0;

        while(start < original){
            start *= 2;
            size++;
        }
        int firstbin = start/2; 
        int[] revbin = new int[size];

        for(int i = 0; i < size; i++){
            if(original >= firstbin){
                original -= firstbin;
                revbin[i] = 1;
                firstbin /= 2;
            } else{
                firstbin /= 2;
                revbin[i] = 0;
            }
        }
        int multiplier = 1;
        int reversed = 0;

        for(int i = 0; i < size; i++){
            reversed += revbin[i] * multiplier;
            multiplier *= 2;
        }   

      System.out.println(reversed);
        s.close();
    }
}
   