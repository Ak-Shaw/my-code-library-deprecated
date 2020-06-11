import java.util.*;

class KthMultiple {

	public static Long findKthMultiple(int k) {

		if (k < 0) {

			return 0l;
		}

		long val = 0l;

		Queue<Long> queue3 = new LinkedList<>();
		Queue<Long> queue5 = new LinkedList<>();
		Queue<Long> queue7 = new LinkedList<>();

		queue3.add(1l);

		for (int i = 0; i < k; i++) {

			long v3 = queue3.size() > 0 ? queue3.peek() : Long.MAX_VALUE;
			long v5 = queue5.size() > 0 ? queue5.peek() : Long.MAX_VALUE;
			long v7 = queue7.size() > 0 ? queue7.peek() : Long.MAX_VALUE;

			val = Math.min(v3, Math.min(v5, v7));

			if (val == v3) {

				queue3.remove();

				queue3.add(3 * val);

				queue5.add(5 * val);
			
			} else if (val == v5) {

				queue5.remove();

				queue5.add(5 * val);

			} else if (val == v7) {

				queue7.remove();
			}

			queue7.add(7 * val);
		}

		return val;
	}

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println(findKthMultiple(k));
	}
}
