import java.util.*;
public class MinimumJumps {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for(int i=0;i<n;i++){
            a.add(sc.nextInt());
        }
        int ans = minimumJumps(n,a);
        System.out.println(ans);
        sc.close();
    }

    static int minimumJumps(int n, ArrayList<Integer> a){

        int destination = n - 1;

        int maxReach = 0;

        int currReach = 0;

        int jumps = 0;

        for (int i = 0; i < n; i++) {

            if (i > maxReach) {
                break;
            }

            if (i > currReach) {
                jumps += 1;
                currReach = maxReach;
            }

            maxReach = Math.max(maxReach, i + a.get(i));
        }

        if (currReach >= destination) {

            return jumps;
        }

        return -1;
    }
}
