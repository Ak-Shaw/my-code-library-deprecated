import java.util.*;

public class Solution {

	private static Scanner sc = new Scanner(System.in);

	static int[] a;
	static int[] dp;

	public static void main(String[] args) {
		
		int x = sc.nextInt();

		a = new int[x + 1];

		for (int i = 1; i < x; i++) {
			a[i] = sc.nextInt();
		}

		dp = new int[x + 1];
		Arrays.fill(dp, -1);

		System.out.println(solve(x));
	}

	static int solve(int x) {

		if (x == 0) {
			return 0;
		}

		if (dp[x] != -1) {
			return dp[x];
		}

		int i;
		int ans = 0;

		for (i = 1; i <= x; i++) {
			ans = Math.max(ans, a[i] + solve(x - i));
		}

		dp[x] = ans;

		return ans;
	}
}