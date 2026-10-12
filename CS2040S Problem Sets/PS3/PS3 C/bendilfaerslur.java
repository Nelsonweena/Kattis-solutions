import java.util.*;

public class bendilfaerslur{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder s = new StringBuilder();
        sc.close();

        if(input.contains(".")){
            //ipv4
            String[] parts = input.split("\\.");
            for(int i = 3; i >= 0; i--){
                s.append(parts[i]).append(".");
            }
            s.append("in-addr.arpa.");
        } else{
           //ipv6
           String str = input.replace("::", ":z:");
           String[] parts = str.split(":");
           int len = parts.length;
           for(int i = len - 1; i >= 0; i--){
                String curr = parts[i];
                int partscount = 0;
                int currlen = curr.length();
                if(curr.equals("z")){
                    int remainder = 8 - len + 1;
                    for(int j = 0; j < remainder; j++){
                        s.append("0.0.0.0.");
                    }
                }else {
                    for(int j = currlen - 1; j >= 0; j--){
                        s.append(curr.charAt(j)).append(".");
                        partscount++;
                        
                    }
                    for(int z = partscount; z < 4; z++){
                        s.append("0").append(".");
                   }
                }
        }
        s.append("ip6.arpa."); 
        }
        System.out.println(s);
    }
}