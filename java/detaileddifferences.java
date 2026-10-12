import java.util.Scanner;

public class detaileddifferences{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        for(int i = 0; i < testcases; i++){

            StringBuilder str = new StringBuilder("");
            String firstin = sc.next();
            String nextin = sc.next();
            int len = firstin.length();

            for(int j = 0; j < len; j++){
                if(firstin.charAt(j) == (nextin.charAt(j))){
                    str.append(".");
                } else{
                    str.append("*");
                }
            }
            System.out.println(firstin);
            System.out.println(nextin);
            System.out.println(str);
            System.out.println("\n");
        }
        sc.close();
    }
}
