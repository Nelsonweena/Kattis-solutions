import java.util.*;

public class inflation2 {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        long noDishes = sc.nextInt();
        //price, count
        HashMap<Long, Long> pricecount = new HashMap<>();
        long sum = 0;
        long inflatedsum = 0;
        for(int i = 0; i < noDishes; i++){
            long price = sc.nextInt(); 
            if(!pricecount.containsKey(price)){
                pricecount.put(price, Long.valueOf(1));
            }else{
                long count = pricecount.get(price);
                count++;
                pricecount.put(price, count);
            }     
            sum += price;     
        }

        int actions = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < actions; i++){
            String act = sc.next();

            if(act.equals("INFLATION")){
                long inflate = sc.nextInt();
                sum += inflate * noDishes; 
                inflatedsum += inflate;
            } else{
                long x = sc.nextInt() - inflatedsum;
                long y = sc.nextInt() - inflatedsum;
                long change = y - x;
                long frequency = 0;

                if(x == y){
                    frequency = 0;

                } else if(pricecount.containsKey(x) && pricecount.containsKey(y)){
                    frequency = pricecount.get(x);
                    long newfreq = frequency + pricecount.get(y);
                    pricecount.remove(x);
                    pricecount.put(y, newfreq);

                } else if(pricecount.containsKey(x)){
                    frequency = pricecount.get(x);
                    pricecount.remove(x);
                    pricecount.put(y, frequency);
                }

               sum += change * frequency;
            }
            System.out.println(sum);
        }
        sc.close();
    }
}