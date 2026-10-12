import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class modulo{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = 10;
        List<Integer> lst = new ArrayList<>();

        for(int i  = 0; i < size; i++){
            int current = s.nextInt();
            int modu = (current % 42); 
            if(!isInside(lst, modu)){
                lst.add(modu);
            }
        }

        System.out.println(lst.size());
        s.close();
    }

    public static boolean isInside(List<Integer> lst, int modu){
       boolean boo = false;
       for(int curr : lst){
        if(curr == modu){
            boo = true;
        }
       } 
       return boo;
    }
}