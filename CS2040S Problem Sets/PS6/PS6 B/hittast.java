import java.util.*;

public class hittast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] prices = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            prices[i] = sc.nextInt();
        }

        List<List<Edge>> lst = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            lst.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            lst.get(u).add(new Edge(v, a, b));
            lst.get(v).add(new Edge(u, a, b));
        }

        sc.close();
        int[] minalfur = dijkstra(1, n, lst, true);
        int[] minbenedict = dijkstra(n, n, lst, false);

        int min = prices[1] + minalfur[1] + minbenedict[1];
        for (int i = 1; i <= n; i++) {
            int cost = prices[i] + minalfur[i] + minbenedict[i];
            if(cost < min){
                min = cost;
            }
        }

        System.out.println(min);
    }

    public static class Edge {
        int vertex;
        int a; 
        int b; 

        Edge(int vertex, int a, int b) {
            this.vertex = vertex;
            this.a = a;
            this.b = b;
        }
    }

    public static int[] dijkstra(int start, int n, List<List<Edge>> lst, boolean isA) {
        int[] min = new int[n + 1];
        Arrays.fill(min, Integer.MAX_VALUE);
        min[start] = 0;

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.offer(new int[]{start, 0}); 

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int currv = current[0];
            int currc = current[1];

            if (currc > min[currv]){
                continue;
            }

            for (Edge edge : lst.get(currv)) {
                int nxt = edge.vertex;
                int cost = 0;
                if(isA){
                    cost = edge.a;
                } else{
                    cost = edge.b;
                }

                if (min[currv] + cost < min[nxt]) {
                    min[nxt] = min[currv] + cost;
                    pq.offer(new int[]{nxt, min[nxt]});
                }
            }
        }

        return min;
    }
}
