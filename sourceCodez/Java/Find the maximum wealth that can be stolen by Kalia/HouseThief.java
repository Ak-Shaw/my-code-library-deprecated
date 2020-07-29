import java.util.*;
class HouseThief {
	
	public static long houseThief(int n, int []arr) {

		if (n == 0) {
			return 0;
		}

		int prev1 = 0;
		int prev2 = 0;

		for (int num : arr) {

			int temp = prev1;

			prev1 = Math.max(prev2 + num, prev1);

			prev2 = temp;
		}

		return prev1;
	}
	public static void main(String []args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int [n];
		for ( int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		long ans = houseThief(n, arr);
		System.out.println(ans);

	}
}
