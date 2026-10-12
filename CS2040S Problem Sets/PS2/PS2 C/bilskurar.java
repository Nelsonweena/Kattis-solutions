import java.util.*;

public class bilskurar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        int[] house = new int[num];
        int[] garage = new int[num];
        
        for(int i = 0; i < num; i++){
            house[i] = sc.nextInt();
        }
        for(int i = 0; i < num; i++){
            garage[i] = sc.nextInt();
        }
        
        int[] map = new int[num + 1];

        for(int i = 0; i < num; i++){
            map[house[i]] = i;
        } 
        for(int i = 0; i < num; i++){
            garage[i] = map[garage[i]];
        }
        
        long collisions = mergesort(garage);
        System.out.println(collisions);
        sc.close();
    }

    public static long mergesort(int[] arr){
        int len = arr.length;
        long count = 0;

        if(len < 2){
            return count;
        }

        int midin = len / 2;
        int[] lefthalf = new int[midin];
        int[] righthalf = new int[len - midin];

        for(int i = 0; i < midin; i++){
            lefthalf[i] = arr[i];
        }

        for(int i = midin; i < len; i++){
            righthalf[i - midin] = arr[i];
        }

        count += mergesort(lefthalf);
        count += mergesort(righthalf);
        count += merge(arr, lefthalf, righthalf);
        return count;
    }

    public static long merge(int[] arr, int[] lefth, int[] righth){

        int leftlen = lefth.length;
        int rightlen = righth.length;
        long swaps = 0;

        int i = 0, j = 0, k = 0;

        while(i < leftlen && j < rightlen){
            if(lefth[i] <= righth[j]){
                arr[k] = lefth[i];
                i++;
            } else{
                arr[k] = righth[j];
                j++;
                swaps += leftlen - i;
            }
            k++;
        }

        while ( i < leftlen){
            arr[k] = lefth[i];
            i++;
            k++;
        }

        while(j < rightlen){
            arr[k] = righth[j];
            j++;
            k++;
        }
        return swaps;
    }   
}