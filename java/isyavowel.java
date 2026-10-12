
import java.util.Scanner;

public class isyavowel{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = s.next();
        int length = input.length();
        int vowel = 0;
        int yowel = 0;

        for(int i = 0; i < length; i++){
            char letter = input.charAt(i); 

            if((letter == 'a') ||(letter == 'e') ||(letter == 'i') ||(letter == 'o') ||(letter == 'u')){
                vowel++;
                yowel++;

            } else if((letter == 'y')){
                yowel++;
            }
        }

        System.out.println(vowel);
        System.out.println(yowel);
        s.close();
    }
}