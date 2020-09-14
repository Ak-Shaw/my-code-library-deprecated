// Decimal to binary conversion using recursion.

import java.util.*;

public class DecToBinRecursive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.print("Binary: ");

		if (n == 0) {
			System.out.println("0");
		} else {
			System.out.println(decToBin(n));
		}
	}

	public static String decToBin(int n) {

		if (n == 0) {
			return "";
		}

		return decToBin(n / 2) + n % 2;
	}

}