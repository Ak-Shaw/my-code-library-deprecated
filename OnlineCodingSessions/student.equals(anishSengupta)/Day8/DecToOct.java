// Decimal to octal conversion.

import java.util.*;

public class DecToOct {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		System.out.print("Octal: ");

		if (n == 0) {
			System.out.println("0");
		} else {
			System.out.println(decToOct(n));
		}
	}

	public static String decToOct(int n) {

		String oct = "";

		while (n != 0) {

			oct = n % 8 + oct;

			n /= 8;
		}

		return oct;
	}
}