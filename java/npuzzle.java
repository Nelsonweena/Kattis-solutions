import java.util.*;

public class npuzzle {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        
        HashMap<Character, List<Integer>> dist = new HashMap<>();
        
        char[][] matrix = {
            {'A', 'B', 'C', 'D'},
            {'E', 'F', 'G', 'H'},
            {'I', 'J', 'K', 'L'},
            {'M', 'N', 'O', '.'}
        };
        char[][] input = new char[4][4];

        for (int i = 0; i < 4; i++) {
            char[] tmp = sc.nextLine().toCharArray();
            for (int j = 0; j < 4; j++) {
                input[i][j] = tmp[j];
                dist.put(matrix[i][j], new ArrayList<>());
                dist.get(matrix[i][j]).add(i);
                dist.get(matrix[i][j]).add(j);
            }
        }
        int scatter = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                char curr = input[i][j];
                if(curr != '.' && curr != matrix[i][j]){
                    int ydiff = Math.abs(i - dist.get(curr).get(0));
                    int xdiff = Math.abs(j - dist.get(curr).get(1));
                    scatter += xdiff + ydiff;
                }
            }
        }
        System.out.println(scatter);
        sc.close();
    }
}
