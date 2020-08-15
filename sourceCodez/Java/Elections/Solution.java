import java.io.*;
import java.util.*;

public class Solution {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int countA = 0;
		int countB = 0;

		int posA = -1;
		int posB = -1;

		String s = br.readLine();

		while (s.isEmpty()) {
			s = br.readLine();
		}

		char[] a = s.toCharArray();

		int pos = -1;

		char lastFoundChar = '-';
		int lastFoundPos = 0;

		for (int i = 0; i < a.length; i++) {

			char c = a[i];

			if (c == 'A' || c == 'B' || c == '-') {
				pos++;
			}

			switch(c) {

				case 'A' : countA++; posA = pos; break;
				case 'B' : countB++; posB = pos; break;
			}

			if (posB < posA && posB == -1) {
				countA += posA;
				posB = posA;
			}

			if (lastFoundChar == c) {

				int count = pos - lastFoundPos -1;

				switch(c) {

					case 'A' : countA += count; break;
					case 'B' : countB += count; break;
				}
			}

			switch(c) {

				case 'A' : lastFoundChar = 'A'; lastFoundPos = pos; break;
				case 'B' : lastFoundChar = 'B'; lastFoundPos = pos; break;
			}
		}

		if (posB > posA) {
			countB+= n - posB - 1;
		}

		// System.out.println("countA = " + countA);
		// System.out.println("countB = " + countB);

		if (countA == countB) {
			System.out.print("Coalition government");
		} else if (countA > countB) {
			System.out.print("A");
		} else {
			System.out.print("B");
		}
	}
}