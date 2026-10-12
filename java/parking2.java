import java.util.*;

public class parking2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        for(int i = 0; i < testcases; i++){
            int visit = sc.nextInt();
            int min = sc.nextInt();
            int max = 0;
            int dist = 0;
            for(int j = 0; j < visit - 1; j++){
                int curr = sc.nextInt();
                if(curr < min){
                    min = curr;
                } else if(max < curr){
                    max = curr;
                }
                int optimal = (max - min) / 2;
                dist = ((optimal - min) + (max - optimal)) * 2;
            }
            System.out.println(dist);
        }
        sc.close();
    }
}
