import java.util.*;
public class babybites {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] arr = sc.nextLine().split(" ");

        sc.close();

        int curr = 1;
        String out = null;
        for(int i = 0; i < n ; i++){
            if(arr[i].equals("mumble")){
                if(curr != i + 1){
                    out = "something is fishy";
                    break;
                } else {
                    curr++;
                }
            } else {
                int tmp = Integer.parseInt(arr[i]);
                if(tmp != i + 1){
                    out = "something is fishy";
                    break;
                } else {
                    curr++;
                }
            }
        }

        if(out == null){
            out = "makes sense";
        }
        
        System.out.println(out);
    }
}
