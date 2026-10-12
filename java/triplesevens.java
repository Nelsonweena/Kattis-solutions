import java.util.*;

public class triplesevens {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int good = 777;
        int bad = 0;
        boolean goodbad = true;
        int digits = sc.nextInt();

        for(int i = 0; i < 3; i++){
            ArrayList<Integer> arr = new ArrayList<>();

            for(int j = 0; j < digits; j++){
                arr.add(sc.nextInt());
            }

            if(!arr.contains(7)){
                goodbad = false;
                break;
            }
        }
        if(goodbad){
            System.out.println(good);
        }else{
            System.out.println(bad);
        }
        sc.close();
    }
}
