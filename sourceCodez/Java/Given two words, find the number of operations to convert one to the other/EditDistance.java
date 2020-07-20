import java.util.*;
public class EditDistance {
    
    static int editDistance(String s1, String s2){

        int n = s1.length();
        int m = s2.length();

        if (n * m == 0) // Edge case, one of the strings is empty
            return n + m;

        // Create and initialize first set of values in table
        int[][] table = new int[n + 1][m + 1];
        for (int i = 0; i < n + 1; i++) {
            table[i][0] = i;
        }
        for (int j = 0; j < m + 1; j++) {
            table[0][j] = j;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                int opt1 = table[i - 1][j] + 1;
                int opt2 = table[i][j - 1] + 1;
                int opt3 = table[i - 1][j - 1];
                if (s1.charAt(i - 1) != s2.charAt(j - 1))
                    opt3 += 1;
                table[i][j] = Math.min(opt1, Math.min(opt2, opt3));
            }
        }

        return table[n][m]; // Holds final answer
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(); 
        String s2 = sc.next(); 
        int ans = editDistance(s1, s2);
        System.out.print(ans);
        sc.close();
    }
}
