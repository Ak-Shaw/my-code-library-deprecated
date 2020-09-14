// Binary Search using recursion.

import java.util.*;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// number of elements
		int n = sc.nextInt();

		// accepting n values
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);

		// accepting search element
		int searchElement = sc.nextInt();

		int searchResult = binarySearch(a, searchElement, 0, a.length - 1);

		System.out.println(Arrays.toString(a));
		if (searchResult == -1) {
			System.out.println("Search unsuccessful");
		} else {
			System.out.println("Element found at index " + searchResult);
		}
	}

	// Recursive method for binary search.
	public static int binarySearch(int[] a, int searchElement, int lb, int ub) {

		if (lb > ub) {
			return -1;
		}

		int m = (lb + ub) / 2;

		if (searchElement < a[m]) {

			return binarySearch(a, searchElement, lb, m - 1);

		} else if (searchElement > a[m]) {
			
			return binarySearch(a, searchElement, m + 1, ub);

		} else {
			// Element found
			return m;
		}
	}
}