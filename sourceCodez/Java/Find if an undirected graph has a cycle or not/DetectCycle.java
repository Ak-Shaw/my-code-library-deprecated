import java.util.*;
import java.io.*;

class DetectCycle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		while ((t--) > 0) {
			int nodes = sc.nextInt();
			int e = sc.nextInt();
			ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
			for (int i = 0; i < e; i++) {
				ArrayList<Integer> b = new ArrayList<Integer>();
				b.add(sc.nextInt());
				b.add(sc.nextInt());
				edges.add(b);
			}
			String ans = DetectCycle.detectCycle(nodes, edges);
			System.out.println(ans);
		}
	}

	public static String detectCycle(int nodes, ArrayList<ArrayList<Integer>> edges) {

		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= nodes; i++) {
			adj.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < edges.size(); i++) {

			// Convert edge list to adjacency list

			int x, y;

			x = edges.get(i).get(0);
			y = edges.get(i).get(1);
			adj.get(x).add(y);
			adj.get(y).add(x);
		}

		int[] visited = new int[nodes + 1];

		init(visited);

		for (int i = 1; i <= nodes; i++) {

			if (visited[i] == 0) {
				boolean foundCycle = findCycleByDFS(i, adj, visited, -1);

				if (foundCycle) {
					return "Yes";
				}
			}
		}

		return "No";
	}

	static boolean findCycleByDFS(int start, ArrayList<ArrayList<Integer>> adj, int[] visited, int parent) {

		visited[start] = 1;

		for (Integer connectedNode : adj.get(start)) {

			if (visited[connectedNode] == 0) {

				boolean foundCycle = findCycleByDFS(connectedNode, adj, visited, start);

				if (foundCycle) {
					return true;
				}
			}

			else if (visited[connectedNode] == 1 && connectedNode != parent) {
				return true;
			}
		}

		return false;
	}

	static void init(int[] visited) {
		for (int i = 0; i < visited.length; i++) {
			visited[i] = 0;
		}
	}
}
