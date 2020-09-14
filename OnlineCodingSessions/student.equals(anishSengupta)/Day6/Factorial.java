// Code to find factorial of a number using recursion.

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("Factorial: " + fact(n));
	}

	// Recursive method to calculate factorial of n.
	public static int fact(int n) {

		if (n == 0 || n == 1) {
			return 1;
		}

		return n * fact(n - 1);
	}
}