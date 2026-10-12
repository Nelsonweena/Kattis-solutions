
import java.util.Scanner;

public class skener{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int cols = s.nextInt();
        int height = s.nextInt();
        int width = s.nextInt();
        String[] arr = new String[rows];

        for(int c = 0; c < rows; c++){
            arr[c] = s.next();
        }
        
        for(int i = 0; i < rows; i++){
            String curRow = arr[i];
            StringBuilder str = new StringBuilder("");

            for(int j = 0; j < cols; j++){
                char curchar = curRow.charAt(j);

                for(int h = 0; h < width; h++){
                    str.append(curchar);
                }
            }

            for(int k = 0; k < height; k++){
                System.out.println(str);
            }      
        }
        
        s.close();
    }
}