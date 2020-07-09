import java.util.*;

class DiameterOfTree{
	
	private static int diameterOfTree(int n, Vector<Vector<Integer>> edges)
	{
		ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

		for (int i = 0; i <= n; i++) { adj.add(new ArrayList<Integer>()); }	

		for (int i = 0; i < edges.size(); i++) { // Convert to Adjacency list
			int x = edges.get(i).get(0);
			int y = edges.get(i).get(1);
			adj.get(x).add(y);
			adj.get(y).add(x);
		}

		// The bfs() will return an array of size 2.
		// First element will represent the farthest element
		// found by implementing BFS.
		// Second element will represent the distance.
		int[] resultOfBFS1 = bfs(adj, 1, n);
		int[] resultOfBFS2 = bfs(adj, resultOfBFS1[0], n);

		return resultOfBFS2[1];
	}

	private static int[] bfs(ArrayList<ArrayList<Integer>> adj, int source, int n) {

		int[] dis = new int[n + 1];

		Arrays.fill(dis, -1);

		Queue<Integer> q = new LinkedList<>();

		q.add(source);

		// distance of source from itself will be 0
		dis[source] = 0;

		while (!q.isEmpty()) {

			int t = q.poll();

			// Loop for all adjacent nodes of node t
			for (int i = 0; i < adj.get(t).size(); ++i) {

				int v = adj.get(t).get(i);

				// push node into queue only if 
				// it is not visited already
				if (dis[v] == -1) {
					q.add(v);
					// make distancee of v, one more
					// than distance of t
					dis[v] = dis[t] + 1;
				}
			}
		}

		int maxDis = 0;
		int nodeIdx = 0;

		// get farthest node distance and its index
		for (int i = 1; i <= n; i++) {
			if (dis[i] > maxDis) {
				maxDis = dis[i];
				nodeIdx = i;
			}
		}

		int[] result = {nodeIdx, maxDis};

		return result;

	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for(int test=0;test<t;test++)
		{
			int n=sc.nextInt();
			int m=sc.nextInt();
			Vector<Vector<Integer> > edges = new Vector<Vector<Integer> >();
			for(int i=0;i<m;i++)
			{
				int u=sc.nextInt();
				int v=sc.nextInt();
				Vector<Integer> edge = new Vector<Integer>();
				edge.add(u);
				edge.add(v);
				edges.add(edge);
			}
			System.out.println(diameterOfTree(n,edges));
		}
	}
}
