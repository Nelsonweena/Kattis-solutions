import java.util.*;

public class ferskastajarmid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String freshestname = "";
        int memo = 0;
        
        for(int i = 0; i < size; i++){
            String name = sc.next();
            int contra = sc.nextInt();
            int cool = sc.nextInt();
            int total = contra * cool;

            if(total > memo){
                freshestname = name;
                memo = total;
            } else if(total == memo){
                if(name.compareTo(freshestname) < 0){
                    freshestname = name;
                }
            }
        }
        
        System.out.println(freshestname);
        sc.close();;
    }
}

