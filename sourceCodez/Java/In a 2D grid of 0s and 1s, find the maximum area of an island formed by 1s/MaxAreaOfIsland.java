import java.util.*;
import java.io.*;

class MaxAreaOfIsland{

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int n,m;

        n = sc.nextInt();
        m = sc.nextInt();
        
        ArrayList<ArrayList<Integer> > a = new ArrayList<ArrayList<Integer> >();
        for(int i=0;i<n;i++){
            ArrayList<Integer> b = new ArrayList<>();

            for(int j = 0;j<m;j++){
                b.add(sc.nextInt());
            }
            a.add(b);
        }

        int ans = MaxAreaOfIsland.maxAreaOfIsland(a);
        System.out.println(ans);
    }   

    public static int maxAreaOfIsland(ArrayList<ArrayList<Integer>> a){

        int n = a.size();
        int m = a.get(0).size();

        int maxArea = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a.get(i).get(j) == 1) {
                    maxArea = Math.max(maxArea, dfs(i, j, a, n, m));
                }
            }
        }

        return maxArea;
    }

    public static int dfs(int i, int j, ArrayList<ArrayList<Integer>> a, int n, int m) {

        if (i >= 0 && j >= 0 && i < n && j < m && a.get(i).get(j) == 1) {

            a.get(i).set(j, 0);
            return 1 + dfs(i + 1, j, a, n, m) + dfs(i, j + 1, a, n, m) + dfs(i - 1, j, a, n, m) + dfs(i, j - 1, a, n, m);
        }

        return 0;
    }
}
