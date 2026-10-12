import java.util.*;

public class risdomare{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfportions = sc.nextInt();
        sc.nextLine();
        String preference = sc.next();
        int memoGrains = 0; 
        int memoSize = 0; 
        int memototal = 0; 
        int memoindex = 0; 
        
        for(int i = 1; i < noOfportions + 1; i++){ 
            int Grains = sc.nextInt(); 
            int Size = sc.nextInt(); 
            int total = Grains + Size; 

            if(total > memototal){
                memoGrains = Grains; 
                memoSize = Size; 
                memototal = total;
                memoindex = i; 

            }else if(total == memototal){
                if(preference.equals("antal")){
                    if(Grains > memoGrains){
                        memoindex = i;
                        memoSize = Size;
                        memoGrains = Grains;
                    }

                }else{
                    if(Size > memoSize){
                        memoindex = i;
                        memoSize = Size;
                        memoGrains = Grains;
                    }
                }

            }
        }
        System.out.println(memoindex);
        sc.close();;
    }
}

