// Decimal to binary conversion.

import java.util.*;

public class DecToBin {

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

		String bin = "";

		while (n != 0) {

			bin = n % 2 + bin;

			n /= 2;
		}

		return bin;
	}
}