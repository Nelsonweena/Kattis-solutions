import java.util.Scanner;

public class bitteeinbit{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int length = input.length();
        int output = 1;

        for(int i = 0; i < length; i++){
            if(input.charAt(i) == '0'){
                output = 0;
            }
        }

        System.out.println(output);
        s.close();
    }
}