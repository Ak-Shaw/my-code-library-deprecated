import java.util.*;

public class Coins {
    
    int countWays(int total) {

        int[] denominations = {25, 10, 5, 1}; // 4 values

        int[][] table = new int[4][total + 1];

        int mod = 1000000007;

        for (int i = 0; i < 4; i++) // Initialize to 0 when total is 0
            table[i][0] = 1;

        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= total; j++) {
                if (i > 0)
                    table[i][j] = table[i - 1][j] % mod;

                if (j >= denominations[i])
                    table[i][j] += (table[i][j - denominations[i]] % mod);
            }
        }

        return table[4 - 1][total];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coins result = new Coins();
        int n = scanner.nextInt();
        int answer = result.countWays(n);
        System.out.println(answer);
        scanner.close();
    }
}