import java.util.*;

class ConnectRopes{

	private static long connectRopes(Vector<Long> arr)
	{
		PriorityQueue<Long> pq = new PriorityQueue<>();

		for (int i = 0; i < arr.size(); i++) {
			pq.add(arr.get(i));
		}

		long res = 0l;

		while (pq.size() > 1) {

			long first = pq.poll();
			long second = pq.poll();

			res += first + second;

			pq.add(first + second);
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<Long> arr = new Vector<Long>();
		for(int i=0;i<n;i++)
			arr.add(sc.nextLong());
		System.out.println(connectRopes(arr));
	}
}
