import java.util.*;

public class symmetricorder {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        while(sc.hasNextInt()){
            
            int size = sc.nextInt();
            String[] arr = new String[size];
            for(int i = 0; i < size; i++){
                arr[i] = sc.next();
            }
            if(size != 0){
                System.out.println("SET " + count);
                
                    int j = 0;
                    
                    while(j < size){
                        System.out.println(arr[j]);
                        j += 2;
                    }

                if(size % 2 != 0){
                    j = size - 2;
                    while(j > 0){
                        System.out.println(arr[j]);
                        j -= 2;
                    }
                } else{
                    j = size - 1;
                    while(j > 0){
                        System.out.println(arr[j]);
                        j -= 2;
                    }
                }
            }
            count++;
        }
        sc.close();
    }
}
