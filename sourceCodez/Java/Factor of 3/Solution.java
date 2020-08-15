import java.util.*;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		// boolean[] res = new boolean[t];

		for (int i = 0; i < t ; i++) {

			int n = sc.nextInt();

			int[] a = new int[n];

			for (int j = 0; j < n; j++) {
				a[j] = sc.nextInt();
			}

			// res[i] = arrangementPossible(a);

			if (arrangementPossible(a)) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

		// for (int i = 0; i < t; i++) {
		// 	if (res[i]) {
		// 		System.out.println("Yes");
		// 	} else {
		// 		System.out.println("No");
		// 	}
		// }
	}

	static boolean arrangementPossible(int[] a) {

		int n = a.length;

		int b0 = 0;
		int b1 = 0;
		int b2 = 0;

		for (int i = 0; i < n; i++) {

			if (a[i] % 3 == 0) {
				b0++;
			} else if (a[i] % 3 == 1) {
				b1++;
			} else {
				b2++;
			}
		}

		if ((b0 == 0 && b1 != 0 && b2 != 0) || b0 > b1 + b2 + 1) { 
			return false; 
		}
		
		return true;
		
	}
}