import java.util.Scanner;

public class sottkvi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOffren = sc.nextInt();
        int daysleft = sc.nextInt();
        int day = sc.nextInt();
        
        int bddate = daysleft + day;
        int availfren = 0;

        for(int i = 0; i < noOffren; i++){
            int quartdate = sc.nextInt();
            quartdate += 14;
            if(quartdate <= bddate){
                availfren++;
            }
        }

        System.out.println(availfren);
        sc.close();;
    }
}
