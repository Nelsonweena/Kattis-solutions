import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.*;

public class sannvirdi {
    public static void main(String[] args) throws IOException {
        // Setting up BufferedReader and PrintWriter for fast I/O
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int contestants = Integer.parseInt(br.readLine());

        HashMap<Integer, String> guessNameMap = new HashMap<>();
        for (int i = 0; i < contestants; i++) {
            String[] input = br.readLine().split(" ");
            String name = input[0];
            int guess = Integer.parseInt(input[1]);
            guessNameMap.put(guess, name);
        }

        int ideas = Integer.parseInt(br.readLine());
        for (int i = 0; i < ideas; i++) {
            int maxValue = Integer.parseInt(br.readLine());
            int nearestGuess = -1;
            String winnerName = ":(";  

            for (Map.Entry<Integer, String> entry : guessNameMap.entrySet()) {
                int guess = entry.getKey();
                if (guess <= maxValue && guess > nearestGuess) {
                    nearestGuess = guess;
                    winnerName = entry.getValue();
                }
            }
            pw.println(winnerName);
        }
        pw.flush();
        pw.close();
    }
}
