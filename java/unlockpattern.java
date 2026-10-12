import java.util.*;

public class unlockpattern{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        //x coord stored in 0
        //y coord stored in 1
        int[] ccoord = new int[2];
        double dist = 0.0;
        for(int r = 0; r < 3; r++){
            for(int c = 0; c < 3; c++){
                arr[r][c] = sc.nextInt();
                if(arr[r][c] == 1){
                    ccoord[0] = r;
                    ccoord[1] = c;
                }
            }
        }
        for(int x  = 1; x < 9; x++){
            int[] ncoord = new int[2];
            for(int r = 0; r < 3; r++){
                for(int c = 0; c < 3; c++){
                    if(arr[r][c] == x + 1){
                        ncoord[0] = r;
                        ncoord[1] = c;
                    }
                }
            }
            dist += Math.sqrt(Math.pow(ncoord[0] - ccoord[0], 2) + Math.pow(ncoord[1] - ccoord[1], 2));
            ccoord = ncoord;
        }
        sc.close();
        System.out.println(dist);
    }
}