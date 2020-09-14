// Code to find the sum of first n natural numbers

import java.util.*;

public class Sum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.println("Sum of first " + n + " natural numbers = " + sum(n));
	}

	// Recursive method to return sum of 
	// first n natural numbers.
	public static int sum(int n) {

		if (n == 1 || n == 0) {
			return n;
		}

		return n + sum(n - 1);
	}
}