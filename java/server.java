import java.util.*;

public class server {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int tasks = sc.nextInt();
        int time = sc.nextInt();
        int count = 0;
        int currtime = 0;
        for(int i = 0; i < tasks; i++){
            int ntime = sc.nextInt();
            currtime += ntime;
            if(currtime <= time){
                count++;
            } else{
                break;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
