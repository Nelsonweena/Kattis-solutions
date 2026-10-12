import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class ps5_b {
    private static final int UNVISITED = 0;
    private static final int VISITED = 1;

    private static final int BLACK = 1;
    private static final int WHITE  = 2;

    private static boolean is_bi = true;

    private static ArrayList<ArrayList<Integer>> al; 
    private static ArrayList<ArrayList<Integer>> fakeAl; 
    private static ArrayList<Integer> status = new ArrayList<>();
    private static ArrayList<Integer> colour = new ArrayList<>();

    private static void dfs(ArrayList<ArrayList<Integer>> lst, int i){
        ArrayList<Integer> curr = lst.get(i);
        status.set(i,VISITED);
        for (Integer adj: curr) {
            if (status.get(adj) == VISITED){
                if (colour.get(i) == colour.get(adj)) is_bi = false;
            }
            else if (status.get(adj) == UNVISITED){
                colour.set(adj, colour.get(i) == WHITE ? BLACK : WHITE);
                dfs(lst, adj);
            }   
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out); 

        String[] temp = br.readLine().split(" ");

        int n = Integer.parseInt(temp[0]), m = Integer.parseInt(temp[1]), t = Integer.parseInt(temp[2]);

        al = new ArrayList<>();
        fakeAl = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(new ArrayList<>());
            fakeAl.add(new ArrayList<>());
        }
        status = new ArrayList<>(Collections.nCopies(n,UNVISITED));
        colour = new ArrayList<>(Collections.nCopies(n,0));
        long num_edge = m;
        String a = "0",b = "0",c = "0",d = "0";


        while (m -- > 0) { //init graph adj list
            temp = br.readLine().split(" ");
            int u = Integer.parseInt(temp[0]), v = Integer.parseInt(temp[1]);
            switch (t) {
                case 1 -> {//undirected
                    al.get(u).add(v);
                    al.get(v).add(u);
                }
                case 2 -> {//directed
                    al.get(u).add(v);
                    fakeAl.get(u).add(v);
                    fakeAl.get(v).add(u);
                }
            }
        }

        if (n == 1 && num_edge == 0) {
            writer.print("1 1 1 1");
            writer.close();
            return;
        }

        //check complete
        if (t == 1) b = num_edge == (n) * (n-1) / 2 ? "1" : "0";
        else b = num_edge == (n) * (n-1) ? "1" : "0";

        //find cc
        int cc = 0;
        for (int i = 0; i< n; i++ ) {
            if (status.get(i) == UNVISITED) {
                cc++;
                colour.set(i, BLACK);
                if (t == 2)dfs(fakeAl, i);
                else dfs(al,i);
            }
        }

        //check tree
        if (!b.equals("1")){
            boolean is_tree = num_edge == n - 1 ? true : false;
            boolean is_connected = cc == 1;

            //a = !has_cycles && is_tree && is_connected ? "1" : "0";
            a = is_tree && is_connected ? "1" : "0";
        }

        //check bipartite 
        c = a.equals("1") ? "1" : "0"; 
        ArrayList<Integer> inDeg = new ArrayList<>(Collections.nCopies(n,0));
        if (t == 1) c = is_bi ? "1" : "0";
        else { //check bi
            inDeg = new ArrayList<>(Collections.nCopies(n,0));
            ArrayList<Integer> outDeg = new ArrayList<>(Collections.nCopies(n,0));
            for (int i = 0; i<n ;i++ ) {//pop in deg
                outDeg.set(i, al.get(i).size());
                for (Integer x : al.get(i)) {
                    inDeg.set(x,inDeg.get(x) + 1);
                }
            }

            c = "1";
            //make sure cannot have in and out > 1
            for (int i = 0; i<n ;i++ ) {
                if (inDeg.get(i) > 0 && outDeg.get(i) > 0) {
                    c = "0";
                    break;
                }
            }
        } 

        //check DAG
        if(t == 1 && num_edge == 0) d = "1";
        else if (t == 2){
            Queue<Integer> q = new LinkedList<Integer>();
            int visit_count = 0;


            for (int i = 0; i<n ;i++ ) {
                if (inDeg.get(i) == 0) q.add(i);  
            }

            while (!q.isEmpty()) {
                visit_count++;
                int curr = q.poll();
                for (Integer x : al.get(curr)) {
                    inDeg.set(x, inDeg.get(x) - 1);
                    if (inDeg.get(x) == 0) q.add(x);
                }
            }

            d = visit_count != n ? "0" : "1";
        }


        writer.print(a + " " + b + " " + c + " " + d);
        writer.close();
    }
}
