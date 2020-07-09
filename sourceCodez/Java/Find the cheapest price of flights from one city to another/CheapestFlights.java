import java.util.*;

public class CheapestFlights {

    public static int cheapestFlights(int n, ArrayList<ArrayList<Integer>>flights, int source, int dest, int k){
        
        //Convert to Adjacency matrix
        int adj_matrix[][] = new int[n + 1][n + 1];
        for (int i = 0; i < flights.size(); i++) {
            adj_matrix[flights.get(i).get(0)][flights.get(i).get(1)] = flights.get(i).get(2);
        }

        // Shortest distances
        int[] distances = new int[n + 1];

        // Shortest steps
        int[] curr_stops = new int[n + 1];

        Arrays.fill(distances, Integer.MAX_VALUE);
        Arrays.fill(curr_stops, Integer.MAX_VALUE);

        distances[source] = 0;
        curr_stops[source] = 0;

        // Priority queue to hold (city, price, num stops)
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((a, b) -> a[1] - b[1]);
        minHeap.offer(new int[]{source, 0, 0});

        while (!minHeap.isEmpty()) {

            int[] info = minHeap.poll();
            int node = info[0], cost = info[1], stops = info[2];

            if (node == dest) { // Destination
                return cost;
            }

            if (stops == k + 1) { // No more stops
                continue;
            }

            for (int neigh = 1; neigh <= n; neigh++) { // Visit all neighboring cities
                if (adj_matrix[node][neigh] > 0) {
                    int u = cost, v = distances[neigh], w = adj_matrix[node][neigh];
                    if (u + w < v) { // Better cost option
                        minHeap.offer(new int[]{neigh, u + w, stops + 1});
                        distances[neigh] = u + w;
                    }
                    else if (stops + 1 < curr_stops[neigh]) { // Fewer stops option
                        minHeap.offer(new int[]{neigh, u + w, stops + 1});
                        curr_stops[neigh] = stops;
                    }
                }
            }
        }

        return distances[dest] == Integer.MAX_VALUE ? -1 : distances[dest];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int e = sc.nextInt();
        ArrayList<ArrayList<Integer>>flight = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < e; i++) {
            flight.add(new ArrayList<Integer>());
            flight.get(i).add(sc.nextInt());
            flight.get(i).add(sc.nextInt());
            flight.get(i).add(sc.nextInt());
        }
        int source = sc.nextInt();
        int des = sc.nextInt();
        int k = sc.nextInt();
        int ans = cheapestFlights(n,flight,source,des,k);
        System.out.print(ans);
        sc.close();
    }
}