
import java.io.*;

class racinggame {
  public static void main (String[] args) throws Exception {
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    int[] scoreboard = new int[10];
    int ops = Integer.parseInt(rd.readLine());
    int len = 10;
    int elements = 0;

    for(int i = 0; i < ops; i++){
        String line = rd.readLine();
        String[] parts = line.split(" ");
        int command = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);

        if(command == 1){
            insert(scoreboard, n, elements);
            elements++;
        } else if(command == 2){

            for(int j = 0; j < len; j++){
                scoreboard[j] += n;
            }
        } else{
            pw.println(scoreboard[n - 1]);
            pw.flush();
        
        }
    }
  }
  public static void insert(int[] arr, int n, int elements){
    if(elements < 10){
        int i = 0;
        while(i < elements && arr[i] < n){
            i++;
        }
        for(int j = elements; j > i; j--){
            arr[j] = arr[j - 1];
        }
        arr[i] = n;
    } else if(elements >= 10){
        int index = 0;
        while(index < 10 && arr[index] < n){
            index++;
        }
        if(index == 10){
        } else {
            for(int j = 9; j > index; j--){
                arr[j] = arr[j - 1];
            }
            arr[index] = n;
        }
    }
}
}
