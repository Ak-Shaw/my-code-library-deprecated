import java.util.*;

public class StackUsingArray {

	private int[] stack;
	private int currentSize;
	private int maxSize;

	StackUsingArray(int maxSize) {
		stack = new int[maxSize];
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

		// If stack is empty.
		if (empty()) {
			return Integer.MIN_VALUE;
		}

		// If stack is not empty, currentSize will
		// hold position of the last element.
		return stack[currentSize - 1];
	}

	public int pop() {

		// If stack is empty.
		if (empty()) {
			return Integer.MIN_VALUE;
		}

		currentSize--;

		// Here currentSize will hold the index 
		// of the last element.
		return stack[currentSize];

	}

	public int push(int item) {

		// If stack is already full.
		if (currentSize == maxSize) {
			return Integer.MIN_VALUE;
		}

		stack[currentSize++] = item;

		return item;
	}

	// Method implementing binary search on stack array.
	public int search(int item) {

		int lb = 0, ub = currentSize - 1, m;

		while (lb <= ub) {

			m = (lb + ub) / 2;

			if (item < stack[m]) {
				ub = m - 1;
			} else if (item > stack[m]) {
				lb = m + 1;
			} else {
				return m + 1;
			}
		}

		return Integer.MIN_VALUE;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter size of stack: ");
		int maxSize = sc.nextInt();

		StackUsingArray stack = new StackUsingArray(maxSize);

		boolean infinite = true;

		while(infinite) {

			System.out.println(	"Press 1 to test if stack is empty.\n" +
								"Press 2 to peek.\n" +
								"Press 3 to pop.\n" +
								"Press 4 to push.\n" +
								"Press 5 to search.\n" +
								"Press 0 to exit.\n");
			System.out.print("Choice: ");
			int c = sc.nextInt();

			switch (c) {
				
				case 1:

					System.out.println(stack.empty());
					break;

				case 2:

					if (stack.empty()) {
						System.out.println("Stackunderflow.");
						break;
					}

					System.out.println("Topmost element is " + stack.peek());
					break;

				case 3:

					if (stack.empty()) {
						System.out.println("Stackunderflow.");
						break;
					}

					System.out.println("Popped element is " + stack.pop());
					break;

				case 4:

					if (stack.currentSize == stack.maxSize) {
						System.out.println("Stackoverflow.");
						break;
					}

					System.out.print("Enter value: ");
					int val = sc.nextInt();

					stack.push(val);

					System.out.println("Current size of stack is " + stack.currentSize);
					break;

				case 5:

					if (stack.empty()) {
						System.out.println("Stackunderflow.");
						break;
					}

					System.out.print("Enter search element: ");
					int searchVal = sc.nextInt();

					int searchResult = stack.search(searchVal);

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