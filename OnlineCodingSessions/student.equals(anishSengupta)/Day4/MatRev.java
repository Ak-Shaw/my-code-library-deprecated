// Accept a matrix and reverse every element.
// Store the matrix in one object and store its reverse in another.

import java.util.*;

public class MatRev {

	private int m;
	private int n;
	private int[][] arr;

	public MatRev(int mm, int nn) {

		m = mm;
		n = nn;

		arr = new int[m][n];
	}

	void fillArray() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter matrix elements:\n");

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
	}

	int reverse(int x) {

		int rev = 0;

		while (x > 0) {

			rev = rev * 10 + x % 10;

			x /= 10;
		}

		return rev;
	}

	void revMat(MatRev P) {

		for(int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				this.arr[i][j] = reverse(P.arr[i][j]);
			}
		}
	}

	void show() {

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print("\t" + arr[i][j]);
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Rows: ");
		int m = sc.nextInt();

		System.out.print("Colomns: ");
		int n = sc.nextInt();

		MatRev mat1 = new MatRev(m, n);

		mat1.fillArray();

		MatRev mat2 = new MatRev(m, n);

		// Reverses each element of the array
		// of the parameterized object and stores
		// it in the array of the current object.
		mat2.revMat(mat1);

		mat2.show();
	}
}
