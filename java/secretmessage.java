import java.util.*;

public class secretmessage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0; i < size; i++){
            String word = sc.next();
            int len = word.length();
            int k = 1;

            while(Math.pow(k, 2) < len){
                k++;
            }
            char[][] bef = new char[k][k];
            if(len < Math.pow(k, 2)){
                String s = "";
                int missin = (int) Math.pow(k, 2) - len; 
                for(int j = 0; j < missin; j++){
                    s += "*";
                }
                word += s;
            }
            int index = 0;
            for(int c = k - 1; c >= 0; c--){
                for(int r = 0; r < k; r++){
                    bef[r][c] = word.charAt(index);
                    index++;
                }
            }
            StringBuilder sce = new StringBuilder();
            for(int r = 0; r < k; r++){
                for(int c = 0; c < k;c++){
                    if(bef[r][c] != '*'){
                        sce.append(bef[r][c]);
                    }
                }
            }

            System.out.println(sce.toString());
        }
        sc.close();
    }
}