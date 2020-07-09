import java.util.*;
public class MinCostOfRoad {

    public static int minCostOfRoad(int n, ArrayList<ArrayList<Integer>> edges){

        int[] keyval = new int[n + 1]; // One extra since cities are numbered from 1 to n
        Boolean[] mstset = new Boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            keyval[i] = Integer.MAX_VALUE;
            mstset[i] = Boolean.FALSE;
        }

        keyval[1] = 0;

        for (int i = 1; i <= n; i++) {

            int u = minValue(n, keyval, mstset); // Select the next city with least value
            mstset[u] = true;

            for (int j = 0; j < edges.size(); j++) { // Using adjacency matrix would optimize this

                int a = edges.get(j).get(0); // City1
                int b = edges.get(j).get(1); // City2
                int c = edges.get(j).get(2); // Weight

                if (a == u && mstset[b] == Boolean.FALSE && c < keyval[b]) {
                    keyval[b] = c;
                }

                if (b == u && mstset[a] == Boolean.FALSE && c < keyval[a]) {
                    keyval[a] = c;
                }
            }
        }

        int cost = 0;

        for (int i = 1; i <= n; i++)
            cost += keyval[i];

        return cost;
    }

    public static int minValue(int n, int[] keyval, Boolean[] mstset) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        // Loop through values for the nodes and for nodes that are not
        // yet included in MST, find the minimum value
        for (int i = 1; i <= n; i++) {
            if (mstset[i] == Boolean.FALSE && keyval[i] < min) {
                min = keyval[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,e;
        n = sc.nextInt();
        e = sc.nextInt();
        ArrayList<ArrayList<Integer>>edges = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < e; i++) {
            edges.add(new ArrayList<Integer>());
            edges.get(i).add(sc.nextInt());
            edges.get(i).add(sc.nextInt());
            edges.get(i).add(sc.nextInt());
        }
        int ans = minCostOfRoad(n,edges);
        System.out.print(ans);
        sc.close();
    }
}
