
import java.util.Scanner;

public class keysphonewallet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder out = new StringBuilder("");
        int size = s.nextInt();
        String[] arr = new String[size];
        

        for(int i = 0; i < size; i++){
            arr[i] = s.next();
        }

        if(!ispresent("keys", arr)){
            out.append("keys ");
        }
        if(!ispresent("phone", arr)){
            out.append("phone ");
        }
        if(!ispresent("wallet", arr)){
            out.append("wallet ");
        }
        if(out.length() == 0){
            out.append("ready");
        }

        System.out.println(out.toString());
        s.close();;
    }
    
    public static boolean ispresent(String item, String[] arr){
        
        boolean availability = false;

        for(String str : arr){
            if(str.equals(item)){
                availability = true;
            }
        }

        return availability;
    }
}