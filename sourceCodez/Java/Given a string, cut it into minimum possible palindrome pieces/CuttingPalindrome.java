import java.util.*;

public class CuttingPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int ans = cuttingPalindrome(n,s);
        System.out.println(ans);
        sc.close();
    }
    
    static int cuttingPalindrome(int n,String s){

        // palindrome[i][j] is marked True if substring i to j is a palindrome
        boolean[][] palindrome = new boolean[n][n];

        // Initialize with every character being a palindrome
        for (int i = 0; i < n; i++)
            palindrome[i][i] = true;

        for (int start = n - 1; start >= 0; start--) {
            for (int end = start + 1; end < n; end++) {
                if (s.charAt(start) == s.charAt(end)) {
                    // Two character string or the substring in the middle is a palindrome
                    if (end - start == 1 || palindrome[start + 1][end - 1]) {
                        palindrome[start][end] = true;
                    }
                }
            }
        }

        // cuts[i] stores the minimum cuts for substring from index i till the end
        int[] cuts = new int[n];
        for (int start = n - 1; start >= 0; start--) {
            int minCuts = n; // maximum possible value for cuts
            for (int end = n - 1; end >= start; end--) {
                if (palindrome[start][end]) { // Valid cut, if full substr is palindrome, 0 cuts
                    minCuts = (end == s.length() - 1) ? 0 : Math.min(minCuts, 1 + cuts[end + 1]);
                }
            }
            cuts[start] = minCuts;
        }

        return cuts[0];
    }
}
