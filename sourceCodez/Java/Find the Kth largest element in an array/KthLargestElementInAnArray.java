import java.io.*;
import java.util.*;

class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {

        // Min Heap
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

        for (int n : nums) {

            heap.add(n);

            // Restrict size of heap to K

            if (heap.size() > k)

                heap.poll(); // Remove smallest
        }

        // The top element will be the Kth largest

        return heap.poll();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; ++i)
            nums[i] = scanner.nextInt();

        int k = scanner.nextInt();
        scanner.close();

        int result = new KthLargestElementInAnArray().findKthLargest(nums, k);
        System.out.println(result);
    }
}
