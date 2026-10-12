import java.util.*;

public class namnsdag {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        char[] namearr = sc.next().toCharArray();  
        int len = namearr.length; 
        int n = sc.nextInt();
        int count = 0;
        String[] cheats = new String[n];
        for(int i = 0; i < n ; i++){
            cheats[i] = sc.next();
        }

        for(int i = 0; i < n; i++){
            int diffcount = 0;
            if(cheats[i].length() != len){
                count++;
                continue;
            } else{
                for(int j = 0; j < len; j++){
                    if(cheats[i].charAt(j) != namearr[j]){
                        diffcount++;
                    }
                }
                count++;
            }
            if(diffcount == 1){
                break;
            }
        }
        sc.close();
        System.out.println(count);  
    }
}
