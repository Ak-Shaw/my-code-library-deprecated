import java.util.*;
import java.io.*;

class ShortestPath{
    public static int n;
    public static int m;


    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);

        n = sc.nextInt();
        m = sc.nextInt();

        ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<m;i++){
            edges.add(new ArrayList<Integer>());
            edges.get(i).add(sc.nextInt());
            edges.get(i).add(sc.nextInt());
        }

        int source,destination;
        source = sc.nextInt();
        destination = sc.nextInt();


        List<Integer> ans = ShortestPath.shortestPath(n,edges,source,destination);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }

    }

    public static ArrayList<ArrayList<Integer>> adj;

    public static List<Integer> shortestPath(int n,ArrayList<ArrayList<Integer>> edges,int source,int destination){
        
        adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n + 1; i++) {
            adj.add(new ArrayList<Integer>());
        }

        for (int i = 0; i < m; i++) {
            int x, y;
            x = edges.get(i).get(0);
            y = edges.get(i).get(1);

            adj.get(x).add(y);
            adj.get(y).add(x);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(source);
        int[] level = new int[adj.size() + 1];

        level[source] = 1;

        while (!q.isEmpty()) {
            int top = q.remove();
            for (Integer i : adj.get(top)) {
                if (level[i] == 0) {
                    level[i] = level[top] + 1;
                    q.add(i);
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        ans.add(destination);
        int curnode = destination;
        for (int i = 0; i < level[destination]; i++) {
            for (Integer j : adj.get(curnode)) {
                if(level[j] == level[curnode] - 1) {
                    ans.add(j);
                    curnode = j;
                    break;
                }
            }
        }

        Collections.reverse(ans);
        return ans;
    }

}
