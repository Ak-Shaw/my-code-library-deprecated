import java.util.*;

public class BeesToHives{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> beesPositions = new ArrayList<>();
        ArrayList<Integer> hivesPositions = new ArrayList<>();

        for(int i=0;i<n;i++){
            beesPositions.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            hivesPositions.add(sc.nextInt());
        }

        int ans = beesToHives(n,beesPositions,hivesPositions);
        System.out.println(ans);

        sc.close();
    }
    public static int beesToHives(int n,ArrayList<Integer> beesPositions,ArrayList<Integer> hivesPositions){

        Collections.sort(beesPositions);
        Collections.sort(hivesPositions);

        int time = 0;

        for (int i = 0; i < n; i++) {
            time = Math.max(time, Math.abs(beesPositions.get(i) - hivesPositions.get(i)));
        }

        return time;
    }
}
