
import java.util.Scanner;

public class spritt {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int classrooms = s.nextInt();
        int availSanitizers = s.nextInt();
        int needsanitizers = 0;
        StringBuilder str = new StringBuilder("");

        for(int i = 0; i < classrooms; i++){
            needsanitizers += s.nextInt();
        }

        if(needsanitizers <= availSanitizers){
            str.append("Jebb");
        }else {
            str.append("Neibb");
        }
        
        System.out.println(str);
        s.close();
    }
}
