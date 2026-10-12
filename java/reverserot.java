import java.util.*;

public class reverserot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_.".toCharArray();
        int arrLength = arr.length;

        while (sc.hasNext()) {
            String[] tmp = sc.nextLine().split(" ");
            if (tmp.length != 2) {
                continue;
            }
            int move = Integer.parseInt(tmp[0]);
            String s = tmp[1];
            int slen = s.length();
            StringBuilder a = new StringBuilder();

            // Find and replace with rotation
            for (int i = 0; i < slen; i++) {
                char curr = s.charAt(i);
                int index = 0;

                // Find the index of the current character
                while (curr != arr[index]) {
                    index++;
                }

                // Calculate the new index with rotation
                index = (index + move) % arrLength; // Wrap around using modulo
                a.append(arr[index]);
            }

            // Reverse the string
            StringBuilder z = new StringBuilder(a).reverse();
            System.out.println(z.toString());
        }
        sc.close();
    }
}
