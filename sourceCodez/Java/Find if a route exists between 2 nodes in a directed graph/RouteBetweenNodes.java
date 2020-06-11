import java.util.*;

public class RouteBetweenNodes {
    boolean routeBetweenNodes(int source , int destination ,int n,  ArrayList<ArrayList<Integer>> edges) {

        init(n);

        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
        }

        int num_edges = edges.size();

        for (int i = 0; i < num_edges; i++) {

            // Convert Edge list to Adjacency List
            int x, y;
            x = edges.get(i).get(0);
            y = edges.get(i).get(1);
            graph.get(x).add(y);
        }

        result = false;

        isPath(source, destination, graph);

        return result;
    }

    boolean result;
    int visited[];
    void init(int n) { // Invoke this initialization somewhere

        this.visited = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            this.visited[i] = 0;
        }
    }

    void isPath(int src, int dest, ArrayList<ArrayList<Integer>> graph) {

        this.visited[src] = 1;

        for (int i = 0; i < graph.get(src).size(); i++) {
            int node = graph.get(src).get(i);
            if (node == dest) {
                this.result = true;
                return;
            }
            if (visited[node] == 0) {
                isPath(node, dest, graph); // DFS
            } // Can check for success and return if we see result == true
        }
        return;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int p = 0 ; p < t ; p++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
        
            for(int i=0;i<m;i++){
                edges.add(new ArrayList<Integer>());
                edges.get(i).add(scanner.nextInt());
                edges.get(i).add(scanner.nextInt());
            }
            int src = scanner.nextInt();
            int dest = scanner.nextInt();
            RouteBetweenNodes answer = new RouteBetweenNodes();
            boolean result = answer.routeBetweenNodes(src, dest,n,edges);
            if (result) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        scanner.close();
    }
}
