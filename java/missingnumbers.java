import java.util.*;

public class missingnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        ArrayList<Integer> in = new ArrayList<>();
        ArrayList<Integer> out = new ArrayList<>();
        int count = 1;
        int max = 0;

        for(int i = 0; i < x; i++){
            int ad = sc.nextInt();
            in.add(ad);
            if(max < ad){
                max = ad;
            }
        }
        sc.close();

        for(int i = 0; i < max - 1; i++){
            if(!in.contains(count)){
                out.add(count);
            }
            count++;
        }
        
        if(out.size() == 0){
            System.out.print("good job");
        } else{
            for(int j : out){
                System.out.print(j + "\n");
            }
        }
    }    
}
