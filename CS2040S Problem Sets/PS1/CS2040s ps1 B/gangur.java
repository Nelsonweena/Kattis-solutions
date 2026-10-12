
import java.util.Scanner;

public class gangur{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String input = s.nextLine();
        int inputsize = input.length();
      
        System.out.println(arrowchecker(inputsize, input));
        s.close();
    }

    public static long arrowchecker(int inputsize, String input){
        long passby = 0;
        long leftarrows = 0;

        for(int i = 0; i < inputsize; i++){
            char nexarrow = input.charAt(inputsize - i - 1);
            if(nexarrow == '<'){
                leftarrows++;
            } else if(nexarrow == '>'){
                passby += leftarrows;               
            }
        }

        return passby;
    }   
}


