import java.util.Scanner;

public class monopol{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numofhotels = s.nextInt();
        int[] distances = new int[numofhotels];

        for(int i = 0; i < numofhotels; i++){
            distances[i] = s.nextInt();
        }
        s.close();
        double probability = calculate(distances);
        System.out.println(probability);
        
    }

    public static double calculate(int[] distances){
        double probability = 0.0;
        for(int distance : distances){
            if((distance >= 2) && (distance <= 12)){
                int numways = 0;
                for(int i = 1; i <= 6; i++){
                    for(int j = 1; j <= 6; j++){
                        if((i+j) == distance){
                            numways++;
                        }
                    }
                }
                probability += (double) numways/36;
            }
        }
        return probability;
    }
}