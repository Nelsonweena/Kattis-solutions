import java.io.*;
import java.util.TreeMap;

public class problems2 { // Ensure the class name matches the filename
    private static byte[] b;
    private static int off;

    private static int getInt() {
        byte c = b[off++];
        int res = 0;
        do {
            res = res * 10 + c - '0';
        } while ((c = b[off++]) >= '0');
        return res;
    }

    public static void main(String[] args) throws IOException {
        System.in.read(b = new byte[System.in.available()]);
        PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int n = getInt();
        int q = getInt();

        TreeMap<Integer, Integer> diffmap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int difftmp = getInt();
            diffmap.put(difftmp, diffmap.getOrDefault(difftmp, 0) + 1);
        }

        for (int i = 0; i < q; i++) {
            int type = getInt();
            int num = getInt();

            // Discard higher than
            if (type == 1) {
                Integer higher = diffmap.higherKey(num);
                removenum(diffmap, higher, writer);
            // Discard lower than
            } else {
                Integer lower = diffmap.lowerKey(num);
                removenum(diffmap, lower, writer);
            }
        }
        writer.flush();
        writer.close();
    }

    public static void removenum(TreeMap<Integer, Integer> diffmap, Integer num, PrintWriter writer) {
        if (num == null) {
            writer.println("-1");
        } else {
            writer.println(num);
            int count = diffmap.get(num);
            if (count == 1) {
                diffmap.remove(num);
            } else {
                diffmap.put(num, count - 1);
            }
        }
    }
}