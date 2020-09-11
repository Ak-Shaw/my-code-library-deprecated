// Code to find GCD of two numbers using recursion.

import java.util.*;

public class GCD {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if (b > a) {
			//Swapping
			int t = a;
			a = b;
			b = t;
		}

		System.out.println("GCD: " + gcd(a, b));
	}

	// Recursive method to find GCD of a and b
	public static int gcd(int a, int b) {

		if (b == 0) {
			return a;
		}

		return gcd(b, a % b);
	}
}