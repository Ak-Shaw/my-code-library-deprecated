// Binary to decimal conversion using recursion.

import java.util.*;

public class BinToDecRecursive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String b = sc.next();

		System.out.println("Decimal: " + binToDec(b, 0));
	}

	public static int binToDec(String b, int i) {

		if (i == b.length()) {
			return 0;
		}

		int digit = b.charAt(b.length() - 1 - i) - 48;

		return (int)(digit * Math.pow(2, i)) + binToDec(b, i + 1);
	}
}