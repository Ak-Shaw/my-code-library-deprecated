import java.util.*;
import java.io.*;
class WallsAndGates {

	public static int[][] WallsAndGates(int [][] grid , int n, int m) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (grid[i][j] == 0) {
					dfs(i, j, grid, 0, n, m);
				}
			}
		}

		return grid;
	}

	public static void dfs(int i, int j, int[][] grid, int d, int n, int m) {

		if (i >= 0 && j >= 0 && i < n && j < m && grid[i][j] >= d) {

			grid[i][j] = d;
			dfs(i + 1, j, grid, d + 1, n, m);
			dfs(i - 1, j, grid, d + 1, n, m);
			dfs(i, j + 1, grid, d + 1, n, m);
			dfs(i, j - 1, grid, d + 1, n, m);
		}
	}

	public static void main(String []args) {
		int n, m;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int [][] grid = new int[n + 1][m + 1];
		for ( int i = 0; i < n; i++) {
			for ( int j = 0; j < m; j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		int [][] distance = WallsAndGates(grid, n, m);
		for ( int i = 0; i < n; i++) {
			for ( int j = 0; j < m; j++) {
				System.out.print(distance[i][j] + " ");
			}
			System.out.println();
		}
	}
}
