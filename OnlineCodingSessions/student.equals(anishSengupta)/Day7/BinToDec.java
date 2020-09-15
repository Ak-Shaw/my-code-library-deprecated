// Binary to decimal conversion.

import java.util.*;

public class BinToDec {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String b = sc.next();

		System.out.println("Decimal: " + binToDec(b));
	}

	public static int binToDec(String b) {

		int s = 0;

		for (int i = 0; i < b.length(); i++) {

			int digit = b.charAt(b.length() - 1 - i) - 48;

			s += (int)(digit * Math.pow(2, i));
		}

		return s;
	}
}