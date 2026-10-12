import java.util.*;

public class plantingtrees {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int max = 0;
        int days = 1;
        int seeds = sc.nextInt();
        int[] daystogrow = new int[seeds];
        for(int i = 0; i < seeds; i++){
            daystogrow[i]= sc.nextInt();
        }
        bubsortdes(daystogrow);
        for(int i = 0; i < seeds; i++){
            int total = daystogrow[i] + days;
            if(total > max){
                max = total;
            }
            days++;
        }
        sc.close();
        System.out.println(max);
    }
    public static int[] bubsortdes(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1; j++){
                if(arr[j + 1] > arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
