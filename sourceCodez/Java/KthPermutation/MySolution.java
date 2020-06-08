import java.util.*;

public class MySolution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		long k = sc.nextLong();

		List<String> alphabets = getAlphaList();

		System.out.println(getPermutation(n,k - 1, alphabets));
	}

	public static String getPermutation(int n, long k, List<String> alphabets) {

		if (n == 0) {
			return "";
		}
		
		long f = factorial(n - 1);

		long i = k / f;

		k = k % f;

		String s = alphabets.get((int)i);
		alphabets.remove((int)i);

		return s + getPermutation(n - 1, k, alphabets);
	}

	public static List<String> getAlphaList() {

		List<String> alphabets = new ArrayList<>();

		for (int i = 65; i <= 90; i++) {
			alphabets.add(Character.toString(i));
		}

		return alphabets;
	}

	public static long factorial(long n) {

		if (n <= 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}
}