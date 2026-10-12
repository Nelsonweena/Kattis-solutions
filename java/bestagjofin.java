
import java.util.Scanner; 

public class bestagjofin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        String[] names = new String[size];
        int[] gifts = new int[size];
        int memoname = 0;
        int memogifts = 0;

        for(int i = 0; i < (size * 2) ; i++){
            if(i % 2 == 0){
                names[i / 2] = s.next();
            } else{
                gifts[i / 2] = s.nextInt();
            } 
        }

        for(int i = 0; i < size ; i++){
            if(gifts[i] > memogifts){
                memogifts = gifts[i];
                memoname = i;
            }
        }

        System.out.println(names[memoname]);
        s.close();
    }
}
