import java.util.*;

public class ConnectedComponentsInGraph {

    int connectedComponentsInGraph(int n,  ArrayList<ArrayList<Integer>> edges) {
        
        for (int i = 0; i < n + 1; i++) {
            graph.add(new ArrayList<Integer>());
        }

        init(n);

        int m = edges.size();

        for (int i = 0; i < m; i++) { // Populate adjacency list

            int x, y;

            x = edges.get(i).get(0);
            y = edges.get(i).get(1);
            graph.get(x).add(y);
            graph.get(y).add(x);            
        }

        int num_conn_components = 0;

        for (int i = 1; i <= n; i++) {
            if (this.visited[i] == 0) {
                num_conn_components++;
                dfs(i);
            }
        }

        return num_conn_components;
    }

    ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    int[] visited;

    void init(int n) { // Initialize before we start
        this.visited = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            this.visited[i] = 0;
        }
    }

    void dfs(int src) {
        this.visited[src] = 1;

        for(int i = 0; i < this.graph.get(src).size(); i++) {
            int neighbor = graph.get(src).get(i);

            if (visited[neighbor] == 0) {
                dfs(neighbor);
            }
        }

        return;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
    
        for(int i=0;i<m;i++){
            edges.add(new ArrayList<Integer>());
            edges.get(i).add(scanner.nextInt());
            edges.get(i).add(scanner.nextInt());
        }
        ConnectedComponentsInGraph answer = new ConnectedComponentsInGraph();
        int result = answer.connectedComponentsInGraph(n, edges);
        System.out.println(result);
        scanner.close();
    }
}
