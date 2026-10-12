import java.util.Scanner;

public class endurvinnsla {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        sc.next();
        double percentage = sc.nextDouble();
        int items = sc.nextInt();
        int nonplast = 0;
        for(int i = 0; i < items; i++){
            String s = sc.nextLine();
            if(!s.equals("plast")){
                nonplast++;
            } 
        }
        if((double) nonplast/items > percentage){
            System.out.println("Neibb");
        } else {
            System.out.println("Jebb");
        }
        sc.close();
    }
}
