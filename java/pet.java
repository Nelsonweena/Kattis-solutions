import java.util.Scanner;

public class pet{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grades = 4;
        int contestants = 5;
        int winner = 0;
        int position = 0;
        int memo = 0;

        for(int i = 0; i < contestants; i++){
            position++;
            int sum = 0;

            for(int j = 0; j < grades; j++){
                sum += sc.nextInt();
            }

            if(sum > memo){
                winner = position;
                memo = sum;
            }

        }
       
        System.out.format("%d %d", winner, memo);
        sc.close();
    }
}