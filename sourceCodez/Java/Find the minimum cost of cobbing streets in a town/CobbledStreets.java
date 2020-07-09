import java.util.*;
public class CobbledStreets {
    
    public static int cobbledStreets(int n, ArrayList<ArrayList<Integer>> street, int p){
        
        int[] keyval = new int[n + 1]; // One extra since the cities are numbered from 1 to n
        Boolean[] mstset = new Boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            keyval[i] = Integer.MAX_VALUE;
            mstset[i] = Boolean.FALSE;
        }

        keyval[1] = 0;

        for (int i = 1; i <= n; i++) {

            int u = minValue(n, keyval, mstset); // Select the next city with least value
            mstset[u] = true;

            for (int j = 0; j < street.size(); j++) { // Using adjacency matrix would optimize this

                int a = street.get(j).get(0); // City1
                int b = street.get(j).get(1); // City2
                int c = street.get(j).get(2); // Weight

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

        return cost*p;
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
        int n,e,t,p;
        t = sc.nextInt();
        while(t>0){
            t--;
            p = sc.nextInt();
            n = sc.nextInt();
            e = sc.nextInt();
            ArrayList<ArrayList<Integer>>street = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < e; i++) {
                street.add(new ArrayList<Integer>());
                street.get(i).add(sc.nextInt());
                street.get(i).add(sc.nextInt());
                street.get(i).add(sc.nextInt());
            }
            int ans = cobbledStreets(n,street,p);
            System.out.println(ans);
        }
        sc.close();
    }
}
