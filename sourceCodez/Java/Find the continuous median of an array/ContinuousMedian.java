import java.util.*;
import java.io.*;

class ContinuousMedian {
	
	public static PriorityQueue<Integer> max_heap = new PriorityQueue<>((a, b) -> b - a); // Smaller half of numbers
	public static PriorityQueue<Integer> min_heap = new PriorityQueue<>((a, b) -> a - b); // Larger half of numbers

	public static ArrayList<Integer> continuousMedian(ArrayList<Integer> nums) {

		ArrayList<Integer> answer = new ArrayList<Integer>();

		for (int i = 0; i < nums.size(); i++) {

			int num = nums.get(i);

			if (max_heap.isEmpty() || max_heap.peek() >= num)
				max_heap.add(num);
			else 
				min_heap.add(num);

			// It could be that both heaps have equal elements or 
			// max_heap has one more element than min_heap
			if (max_heap.size() > min_heap.size() + 1)
				min_heap.add(max_heap.poll());
			else if (max_heap.size() < min_heap.size())
				max_heap.add(min_heap.poll());

			answer.add((int)findMedian());
		}

		return answer;

	}

	public static double findMedian() {

		if (max_heap.size() == min_heap.size()) {
			// Even elements overall, take average
			return max_heap.peek() / 2.0 + min_heap.peek() / 2.0;
		}

		// max_heap has one more than min_heap
		return max_heap.peek();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		for ( int i = 0; i < n; i++) {
			int x = sc.nextInt();
			A.add(x);
		}

		ArrayList<Integer> answer = continuousMedian(A);
		for ( int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i) + " ");
		}

	}
}
