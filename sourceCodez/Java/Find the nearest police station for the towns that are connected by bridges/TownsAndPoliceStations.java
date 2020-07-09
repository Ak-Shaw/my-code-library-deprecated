import java.util.*;

public class TownsAndPoliceStations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,m;
        n = sc.nextInt();
        m = sc.nextInt();
        ArrayList<ArrayList<Integer> > edges = new ArrayList<ArrayList<Integer> >();
        for(int i=0;i<m;i++){
            edges.add(new ArrayList<Integer>());
        }
        for(int i=0;i<m;i++){
            int x,y;
            x= sc.nextInt();
            y = sc.nextInt();
            edges.get(i).add(x);
            edges.get(i).add(y);
        }
        int s = sc.nextInt();
        ArrayList<Integer> sources = new ArrayList<>();
        for(int i=0;i<s;i++){
            sources.add(sc.nextInt());
        }
        ArrayList<Integer> ans = TownsAndPoliceStations.townsAndPoliceStations(n,edges,sources);
        for(int distance:ans){
            System.out.println(distance+" ");
        }
        sc.close();
    }

    public static ArrayList<Integer> townsAndPoliceStations(int n,ArrayList<ArrayList<Integer>>  edges,ArrayList<Integer> sources){

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) { adj.add(new ArrayList<Integer>()); }

        for (int i = 0; i < edges.size(); i++) {    // Convert to Adjacency list
            int x = edges.get(i).get(0) - 1;
            int y = edges.get(i).get(1) - 1;
            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        ArrayList<Integer> distance = new ArrayList<>();
        for (int i = 0; i < n; i++) { distance.add(-1); }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < sources.size(); i++) {
            q.add(sources.get(i) - 1);
            distance.set(sources.get(i) - 1, 0);
        }

        // Multi-source BFS
        while (!q.isEmpty()) {
            int top = q.remove();
            for (int node : adj.get(top)) {
                if (distance.get(node) == -1) {
                    q.add(node);
                    distance.set(node, distance.get(top) + 1);
                }
            }
        }

        return distance;
    }
}
