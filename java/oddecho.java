
import java.util.Scanner;

public class oddecho {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        StringBuilder output = new StringBuilder("");
        String[] arr = new String[size];

        for(int i = 0; i < size; i++){
            arr[i] = s.next();
        }

        for(int i = 0; i < size; i++){
            if(i % 2 == 0){
                output.append(arr[i] + " ");
            }
        }

        System.out.println(output);
        s.close();
    }
}
