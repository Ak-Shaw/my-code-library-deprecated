import java.io.*;
import java.util.*;

public class Solution {

	private static int connectedNodesTemp;

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	int t = sc.nextInt();

    	long[] result = new long[t];

    	for (int i = 0; i < t; i++) {

    		int n = sc.nextInt();
    		long m = sc.nextInt();
    		long a = sc.nextInt();
    		long b = sc.nextInt();

    		Vector<Vector<Integer>> edges = new Vector<Vector<Integer>>();

    		for (int j = 0; j < m; j++) {

    			Vector<Integer> edge = new Vector<Integer>();

    			edge.add(sc.nextInt());
    			edge.add(sc.nextInt());

    			edges.add(edge);
    		}

    		result[i] = minimumConstructionCost(n, a, b, edges);
    	}

    	for (int i = 0; i < t; i++) {
    		System.out.println(result[i]);
    	}
    }

    public static long minimumConstructionCost(int nodes, long templeCost, long roadCost, Vector<Vector<Integer>> edges) {

    	if (templeCost <= roadCost) {
    		return nodes * templeCost;
    	}

    	boolean[] visited = new boolean[nodes + 1];

    	ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

    	for (int i = 0; i <= nodes; i++) {
    		adj.add(new ArrayList<Integer>());
    	}

    	for (int i = 0; i < edges.size(); i++) {

    		int x = edges.get(i).get(0);
    		int y = edges.get(i).get(1);

    		adj.get(x).add(y);
    		adj.get(y).add(x);
    	}

    	long cost = 0;

    	for (int i = 1; i <= nodes; i++) {

			
    		if (!visited[i]) {
    			connectedNodesTemp = 0;
    			dfs(i, adj, visited);
    			cost += templeCost + (connectedNodesTemp - 1) * roadCost;
    		}
    	}

    	return cost;
    }

    public static void dfs(int source, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {

    	connectedNodesTemp++;
    	visited[source] = true;

    	for (int i = 0; i < adj.get(source).size(); i++) {

    		int neighbor = adj.get(source).get(i);

    		if (!visited[neighbor]) {
    			dfs(neighbor, adj, visited);
    		}
    	}

    }
}