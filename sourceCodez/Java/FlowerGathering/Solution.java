import java.io.*;
import java.util.*;

public class Solution {

	private static Scanner sc = new Scanner(System.in);

	static long[][] dp = new long[1005][1005];
	static int[] a;
	static int n;
	static int k;

    public static void main(String[] args) {

    	n = sc.nextInt();

    	k = sc.nextInt();

    	a = new int[n + 1];

    	for (int i = 1; i <= n; i++) {
    		a[i] = sc.nextInt();
    	}

    	for (int i = 0; i < 1005; i++) {
    		Arrays.fill(dp[i], -1);
    	}

    	System.out.println(solve(1, 1));
    }

    static long solve(int ind, int rem) {

    	if (rem == k + 1 || ind == n + 1) return 0;

    	if (dp[ind][rem] != -1) return dp[ind][rem];

    	long ans = 0;
    	ans = Math.max(a[ind] * (k + 1 - rem) + solve(ind + 1, rem + 1), solve(ind + 1, rem));
    	dp[ind][rem] = ans;
    	return ans;
    }
}