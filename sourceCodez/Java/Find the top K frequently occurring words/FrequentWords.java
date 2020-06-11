import java.util.*;

class FrequentWords{
	
	public static Vector<String> frequentWords(Vector<String> vec,int k)
	{
		HashMap<String, Integer> count = new HashMap<String, Integer>();

		for (String word : vec) {

			count.put( word, count.getOrDefault(word, 0) + 1);
		}

		PriorityQueue<String> heap = new PriorityQueue<String>((w1, w2) -> count.get(w1).equals(count.get(w2)) ? w2.compareTo(w1) : count.get(w1) - count.get(w2));

		for (String word : count.keySet()) {

			heap.offer(word);

			if (heap.size() > k)
				heap.poll();
		}

		Vector<String> ans = new Vector<>();

		while (!heap.isEmpty()) {
			ans.add(heap.poll());
		}

		Collections.reverse(ans);

		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Vector<String> vec=new Vector<String>();
		for(int i=0;i<n;i++)
			vec.add(sc.next());
		int k=sc.nextInt();
		Vector<String> ans = frequentWords(vec, k);
		for(int i=0;i<k;i++)
			System.out.println(ans.get(i));
	}
}
