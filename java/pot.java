import java.util.Scanner;

public class pot{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int addends = sc.nextInt();
        int[] numbers = new int[addends];
        int sum = 0;

        for(int i = 0; i < addends; i++){
            numbers[i] = sc.nextInt(); 
        }

        for(int i = 0; i < addends; i++){
            
            int lastdigit = Math.abs(numbers[i] % 10);
            int firstfewdigits = numbers[i] / 10;

            sum += Math.pow(firstfewdigits, lastdigit);
        }
        
        System.out.println(sum);
        sc.close();
    }
}