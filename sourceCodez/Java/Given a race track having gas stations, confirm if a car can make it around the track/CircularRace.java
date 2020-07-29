import java.util.*;

public class CircularRace {
    
    static int circularRace(int n, ArrayList<Integer>gas, ArrayList<Integer>burn){
        
        int start = 0;

        while (start < n) {

            int currGas = 0;

            for (int j = 0; j < n; j++) {

                currGas += gas.get((start + j) % n) - burn.get((start + j) % n);

                if (currGas < 0) {

                    start += j;
                    break;
                }
            }

            if (currGas >= 0) {
                return start + 1;
            }

            start += 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() ;
        ArrayList<Integer>gas = new ArrayList<Integer>();
        ArrayList<Integer>burn = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            gas.add(sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            burn.add(sc.nextInt());
        }
        int ans = circularRace(n,gas,burn);
        System.out.print(ans);
        sc.close();
    }
}
