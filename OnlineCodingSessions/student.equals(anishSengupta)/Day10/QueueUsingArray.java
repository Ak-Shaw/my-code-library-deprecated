import java.util.*;

public class QueueUsingArray {

	private int[] queue;
	private int currentSize;
	private int maxSize;

	QueueUsingArray(int maxSize) {
		queue = new int[maxSize];
		currentSize = 0;
		this.maxSize = maxSize;
	}

	public boolean empty() {
		
		if (currentSize == 0) {
			return true;
		}

		return false;
	}

	public int peek() {

		// If queue is empty.
		if (empty()) {
			return Integer.MIN_VALUE;
		}

		return queue[0];
	}

	public int dequeue() {

		// If queue is empty.
		if (empty()) {
			return Integer.MIN_VALUE;
		}

		int valueToBeReturned = queue[0];

		for (int i = 0; i < currentSize - 1; i++) {

			queue[i] = queue[i + 1];
		}

		currentSize--;

		return valueToBeReturned;

	}

	public int enqueue(int item) {

		// If queue is already full.
		if (currentSize == maxSize) {
			return Integer.MIN_VALUE;
		}

		queue[currentSize++] = item;

		return item;
	}

	// Method implementing binary search on queue array.
	public int search(int item) {

		int lb = 0, ub = currentSize - 1, m;

		while (lb <= ub) {

			m = (lb + ub) / 2;

			if (item < queue[m]) {
				ub = m - 1;
			} else if (item > queue[m]) {
				lb = m + 1;
			} else {
				return m + 1;
			}
		}

		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of queue: ");
		int maxSize = sc.nextInt();

		QueueUsingArray queue = new QueueUsingArray(maxSize);

		boolean infinite = true;

		while(infinite) {

			System.out.println(	"Press 1 to test if queue is empty.\n" +
								"Press 2 to peek.\n" +
								"Press 3 to dequeue.\n" +
								"Press 4 to enqueue.\n" +
								"Press 5 to search.\n" +
								"Press 0 to exit.\n");
			System.out.print("Choice: ");
			int c = sc.nextInt();

			switch (c) {
				
				case 1:

					System.out.println(queue.empty());
					break;

				case 2:

					if (queue.empty()) {
						System.out.println("Queue is empty.");
						break;
					}

					System.out.println("Front element is " + queue.peek());
					break;

				case 3:

					if (queue.empty()) {
						System.out.println("Queue is empty.");
						break;
					}

					System.out.println("Dequeued element is " + queue.dequeue());
					break;

				case 4:

					if (queue.currentSize == queue.maxSize) {
						System.out.println("Queue is full.");
						break;
					}

					System.out.print("Enter value: ");
					int val = sc.nextInt();

					queue.enqueue(val);

					System.out.println("Current size of queue is " + queue.currentSize);
					break;

				case 5:

					if (queue.empty()) {
						System.out.println("Queue is empty.");
						break;
					}

					System.out.print("Enter search element: ");
					int searchVal = sc.nextInt();

					int searchResult = queue.search(searchVal);

					if (searchResult < 0) {
						System.out.println("Search unsuccessful.");
					} else {
						System.out.println("Element found at position " + searchResult);
					}

					break;

				case 0:

					infinite = false;
					break;

				default:

					System.out.println("Wrong option! Kindly try again.\n");
			}
		}
	}
}