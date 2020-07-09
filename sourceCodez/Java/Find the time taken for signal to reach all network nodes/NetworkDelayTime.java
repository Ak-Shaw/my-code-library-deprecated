import java.util.*;

class NetworkDelayTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();

        ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            ArrayList<Integer> b = new ArrayList<>();

            b.add(sc.nextInt());
            b.add(sc.nextInt());
            b.add(sc.nextInt());
            edges.add(b);
        }

        int k = sc.nextInt();

        int ans = NetworkDelayTime.networkDelayTime(n, edges, k);

        System.out.println(ans);
    }

    static Map<Integer, Integer> dist;

    public static int networkDelayTime(int n, ArrayList<ArrayList<Integer>> edges, int k) {

        Map<Integer, List<int[]>> graph = new HashMap();

        for (ArrayList<Integer> edge : edges) {
            if (!graph.containsKey(edge.get(0)))
                graph.put(edge.get(0), new ArrayList<int[]>());
            graph.get(edge.get(0)).add(new int[]{edge.get(1), edge.get(2)});
        }

        dist = new HashMap<>();
        for (int node = 1; node <= n; node++)
            dist.put(node, Integer.MAX_VALUE);

        dist.put(k, 0);
        boolean[] seen = new boolean[n + 1];

        while (true) {
            int candNode = -1;
            int candDist = Integer.MAX_VALUE;
            for (int i = 1; i <= n; i++) {
                if (!seen[i] && dist.get(i) < candDist) {
                    candDist = dist.get(i);
                    candNode = i;
                }
            }

            if (candNode < 0) break;
            seen[candNode] = true;
            if (graph.containsKey(candNode))
                for (int[] info: graph.get(candNode))
                    dist.put(info[0], Math.min(dist.get(info[0]), dist.get(candNode) + info[1]));
        }

        int ans = 0;
        for (int cand : dist.values()) {
            if (cand == Integer.MAX_VALUE) return -1;
            ans = Math.max(ans, cand);
        }

        return ans;
    }
}
