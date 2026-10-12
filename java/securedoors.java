import java.util.*;
public class securedoors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        String ano = " (ANOMALY)";
        ArrayList<String> lst = new ArrayList<>();
        for(int i = 0; i < cases; i++){
            String action = sc.next();
            String name = sc.next();
            StringBuilder s = new StringBuilder(name);

            if(action.equals("entry")){
                s.append(" entered");
                if(lst.contains(name)){
                    s.append(ano);
                } else{
                    lst.add(name);
                }
            } else{
                s.append(" exited");
                if(!lst.contains(name)){
                    s.append(ano);
                } else{
                    lst.remove(name);
                }
            }
            System.out.println(s);
        }
        sc.close();
    }
}
