import java.util.Scanner;

public class taktsvedjur {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long multiplier = 1;
        long score = 0;
        long swings = s.nextInt();
        long count = 0;

        for(int i = 0; i < swings; i++){
            int nxtnum = s.nextInt();

            if(nxtnum == 0){
                if(multiplier > 1){
                    multiplier /= 2;
                }
                count = 0;

            } else {
                count++;

                if((count == (multiplier * 2)) && (multiplier < 8)){
                    multiplier *= 2;
                    count = 0;
                }
                score = score + (multiplier * nxtnum);
            }
        }
        System.out.println(score);
        s.close();
    }
}
