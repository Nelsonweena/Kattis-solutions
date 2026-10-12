
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class everywhere{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < testcases; i++){
            int distinct = distincter(sc); 
            System.out.println(distinct);
        }
        System.out.println();
        sc.close();
    }

    public static int distincter(Scanner sc){
        int NumOfTrips = sc.nextInt();
        sc.nextLine();
        List<String> distinctcities = new ArrayList<>();

        for(int j = 0; j < NumOfTrips; j++){
            String city = sc.next();
            if(!Isinside(city, distinctcities)){
                distinctcities.add(city);
            }
        }

        return distinctcities.size();
    }

    //intially used == instead of .equals and did not work. 

    //The == operator checks whether both objects are the same instance, i.e., 
    //they reference the same memory location. It checks for reference equality.
    //use on Primitive types like int, long, float, char. null

    //The equals() method checks whether two objects have the same value or content, i.e., 
    //they are logically equal. It checks for content equality.
    //use on String comparisons, Object comparisons, Collections and arrays.

    public static boolean Isinside(String city, List<String> distinctcities){
      boolean boo = false;
      for(String curr : distinctcities){
        if(curr.equals(city)){
            boo = true;
        }
      }

      return boo;
    }
}