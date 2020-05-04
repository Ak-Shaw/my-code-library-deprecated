import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

		bubbleSort(a);

		System.out.println(Arrays.toString(a));
	}

	public static void bubbleSort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {

			for (int j = 0; j < a.length - i - 1; j++) {

				if (a[j] > a[j + 1]) {

					int t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
	}
}