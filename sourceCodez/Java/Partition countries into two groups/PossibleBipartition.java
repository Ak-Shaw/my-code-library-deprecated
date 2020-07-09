import java.util.*;
class PossibleBipartition {
	
	private static ArrayList<Integer>[] graph;
	private static Map<Integer, Integer> color;

	private static String possibleBipartition(int n, Vector<Vector<Integer> > edges) {
	
		graph = new ArrayList[n + 1];

		for (int i = 1; i <= n; ++i)
			graph[i] = new ArrayList<>();

		for (int i = 0; i < edges.size(); i++) {
			graph[edges.get(i).get(0)].add(edges.get(i).get(1));
			graph[edges.get(i).get(1)].add(edges.get(i).get(0));
		}

		color = new HashMap<>();

		for (int node = 1; node <= n; ++node)
			if (!color.containsKey(node) && !dfs(node, 0))
				return "Not Possible";

		return "Possible";
	}

	public static boolean dfs(int node, int colr) {

		if (color.containsKey(node))
			return color.get(node) == colr;

		color.put(node, colr);

		for (int neighbor: graph[node])
			if (!dfs(neighbor, colr ^ 1)) // Invert color
				return false;

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int tests = 0; tests < t; tests++) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			Vector<Vector<Integer> > edges = new Vector<Vector<Integer> >();
			for (int i = 0; i < m; i++) {
				int u = sc.nextInt();
				int v = sc.nextInt();
				Vector<Integer> edge = new Vector<Integer>();
				edge.add(u);
				edge.add(v);
				edges.add(edge);
			}
			System.out.println(possibleBipartition(n, edges));
		}

	}
}
