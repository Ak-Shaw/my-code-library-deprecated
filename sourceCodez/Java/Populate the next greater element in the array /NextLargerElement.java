/* 
	Approach utilized:

	We'll traverse the array from the end. 

	We'll maintain a stack with all the valid candidates.

	If the stack is not empty, then we'll take an element from the top 
	and compare it with the current element of array. If the top element 
	is greater, then that's the next greater element and we'll push the current 
	array element onto the stack, or else we'll pop it and go for the next 
	element of stack of valid candidates. If on doing so the stack 
	turns empty, -1 should be considered as the next greater element 
	for the current index.
*/

import java.util.*;
class NextLargerElement {

	static int [] nextLargerElement(int a[], int n) {

		Stack<Integer> stack = new Stack<>();

		int[] result = new int[a.length];

		for (int i = a.length - 1; i >= 0; i--) {

			while (!stack.empty()) {

				int top = stack.peek();

				if (a[i] < top) {

					stack.push(a[i]);

					result[i] = top;

					break;

				}

				stack.pop();

			}

			if (stack.empty()) {

				stack.push(a[i]);
				
				result[i] = -1;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ar[] = new int[n];
		for (int i = 0; i < n; i++) {
			ar[i] = sc.nextInt();
		}
		int [] ans = nextLargerElement(ar, n);
		for (int i = 0; i < ans.length; i++)
			System.out.print(ans[i] + " ");
	}
}
