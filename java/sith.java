import java.util.Scanner;

public class sith{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //in this case string had spaces, initially put sc.next() so it inputed one letter and not a sentence
        sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ab = sc.nextInt();
        sc.close();

        if ((a - b) == ab && (a > b)) {
            System.out.println("VEIT EKKI");
        } else if ((a - b) == ab) {
            System.out.println("JEDI");
        } else {
            System.out.println("SITH");
        }
    }
}