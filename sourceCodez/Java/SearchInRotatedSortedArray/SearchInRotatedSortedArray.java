import java.io.*;
import java.util.*;

class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {

    	int first = 0, last = nums.length - 1;

    	while (first <= last) {

    		int mid = first + (last - first) / 2;

    		if (nums[mid] == target) {

    			return mid;
    		}

    		if (nums[first] <= nums[mid]) {	// If left half is sorted.

    			if (target >= nums[first] && target < nums[mid]) {
    				last = mid - 1;			// Search left half.
    			} else {
    				first = mid + 1;		// Search right half.
    			}
    		} else {						// If right half is sorted.

    			if (target > nums[mid] && target <= nums[last]) {
    				first = mid + 1;		// Search right half.
    			} else {
    				last = mid - 1;			// Search left half.
    			}
    		}
    	}

    	return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        while(q > 0) {
            int target = scanner.nextInt();
            int result = new SearchInRotatedSortedArray().search(nums , target);
            System.out.println(result);
            q--;
        }
	scanner.close();
    }
}
