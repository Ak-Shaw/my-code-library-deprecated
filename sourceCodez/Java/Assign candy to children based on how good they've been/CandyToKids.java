import java.util.*;

public class CandyToKids {
    
    static int candyToKids(int n, ArrayList<Integer>goodness){
        
        int[] left = new int[n];
        Arrays.fill(left, 1);

        int[] right = left.clone();

        for (int i = 0; i < n - 1; i++) {
            if (goodness.get(i + 1) > goodness.get(i)) {
                left[i + 1] = left[i] + 1;
            }
        }

        for (int i = n - 1; i > 0; i--) {
            if (goodness.get(i - 1) > goodness.get(i)) {
                right[i - 1] = right[i] + 1;
            }
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += Math.max(left[i], right[i]);
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>goodness = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            goodness.add(sc.nextInt());
        }
        int ans = candyToKids(n,goodness);
        System.out.print(ans);
        sc.close();
    }
}