import java.util.*;
public class jage{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int players = sc.nextInt();
        int actions = sc.nextInt();
        sc.nextLine();

        String[] names = new String[players];
        for (int i = 0; i < players; i++) {
            names[i] = sc.next();
        }
        sc.nextLine();

        Map<String, Integer> nameToIndex = new HashMap<>();
        for (int i = 0; i < players; i++) {
            nameToIndex.put(names[i], i);
        }

        boolean[] hunter = new boolean[players];
        hunter[0] = true;

        Set<String> cheaters = new HashSet<>();
        for (int i = 0; i < actions; i++) {
            String currenth = sc.next();
            sc.next();
            String currentp = sc.next();

            int indexhunt = nameToIndex.get(currenth);
            int indexprey = nameToIndex.get(currentp);

            if (hunter[indexhunt]) {
                hunter[indexhunt] = false;
                hunter[indexprey] = true;
            } else {
                cheaters.add(currenth);
                hunter[indexprey] = true;
            }
        }
        sc.close();

        List<String> sortedCheaters = new ArrayList<>(cheaters);
        Collections.sort(sortedCheaters);

        System.out.println(sortedCheaters.size());
        if (!sortedCheaters.isEmpty()) {
            StringBuilder str = new StringBuilder();
            str.append(sortedCheaters.get(0));
            for (int j = 1; j < sortedCheaters.size(); j++) {
                str.append(" ").append(sortedCheaters.get(j));
            }
            System.out.println(str);
        } else {
            System.out.println();
        }
    }
}