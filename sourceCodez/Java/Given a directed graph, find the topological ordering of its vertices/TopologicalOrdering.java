import java.util.*;

class TopologicalOrdering{
	
	private static Vector<Integer> topologicalOrdering(int n, Vector<Vector<Integer>> edges)
	{
		Vector<Integer> result = new Vector<Integer>();
		if (n <= 0)
			return result;

		HashMap<Integer, Integer> in_degree = new HashMap<>();
		HashMap<Integer, List<Integer>> adj_list = new HashMap<>();

		// Ignore first index since n are numbered from 1
		in_degree.put(0, Integer.MAX_VALUE);
		for (int i = 1; i <= n; i++) {
			in_degree.put(i, 0);
			adj_list.put(i, new ArrayList<Integer>());
		}

		for (int i = 0; i < edges.size(); i++) { // Adjacency list

			int node = edges.get(i).get(0);
			int neighbor = edges.get(i).get(1);
			adj_list.get(node).add(neighbor);

			// Increment InDegree
			in_degree.put(neighbor, in_degree.get(neighbor) + 1);
		}

		Queue<Integer> sources = new LinkedList<>();

		for (Map.Entry<Integer, Integer> entry : in_degree.entrySet()) {

			if (entry.getValue() == 0) // Sources with In Degree of 0
				sources.add(entry.getKey());
		}

		while (!sources.isEmpty()) {
			int vertex = sources.poll();
			result.add(vertex);
			List<Integer> neighbors = adj_list.get(vertex);
			for (int neighbor : neighbors) { // Decrement InDegree
				in_degree.put(neighbor, in_degree.get(neighbor) - 1);
				if (in_degree.get(neighbor) == 0)
					sources.add(neighbor);
			}
		}

		if (result.size() != n) // Not possible
			return new Vector<Integer>();

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();
		Vector<Vector<Integer> > edges = new Vector<Vector<Integer> >();
		for(int i=0;i<e;i++)
		{
			int u=sc.nextInt();
			int v=sc.nextInt();
			Vector<Integer> edge = new Vector<Integer>();
			edge.add(u);
			edge.add(v);
			edges.add(edge);
		}
		Vector<Integer> answer = topologicalOrdering(n,edges);
		for(int elem : answer)
			System.out.print(elem+" ");
	}
}
