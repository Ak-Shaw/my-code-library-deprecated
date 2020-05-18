import java.io.*;
import java.util.*;

class ShortestUnsortedContinuousSubarray {
    
    public int findUnsortedSubarrayLength(int[] nums) {

        // Scan from left to right to find 
        // first element greater than next element.
        int s = first_element_greater_than_next_left_to_right(nums);

        // If after a traversal by the above method 
        // we have s = last index, it means that 
        // the array is already sorted.
        if (s == nums.length - 1) {

            return 0;
        }

        // Scan from right to left to find 
        // first element lesser than next element.
        int e = first_element_lesser_than_next_right_to_left(nums);

        // The method scans the sub-array starting at index s 
        // and ending at index e for max and min and returns 
        // result in the form of an array like {max, min}.
        int[] max_min = get_max_min_within_indices(nums, s, e);
        int max = max_min[0];
        int min = max_min[1];

        // Getting index of first element greater 
        // than min within subarray indexed 0 and s - 1.
        // If no value as such is encountered, then 
        // the current s will be returned.
        s = get_index_of_first_element_greater_than_val_in_subarray(nums, min, 0, s - 1);

        // Getting index of first element lesser 
        // than max within subarray indexed e + 1 and nums.length, 
        // going from right to left.
        // If no value as such is encountered, then the current 
        // e will be returned.
        e = get_index_of_first_element_lesser_than_val_in_subarray_in_opp_dir(nums, max, e + 1, nums.length - 1);

        // Minimum length of subarray that 
        // needs to be sorted.
        return e - s + 1;
    }

    public int get_index_of_first_element_lesser_than_val_in_subarray_in_opp_dir(int[] arr, int val, int start, int end) {

        for (int i = end; i >= start; i--) {

            if (arr[i] < val) {

                return i;
            }
        }

        // If no such value(lesser than val in subarray going from right to left) 
        // is encountered, then this return value defines that scenario.
        return start - 1;

    }

    public int get_index_of_first_element_greater_than_val_in_subarray(int[] arr, int val, int start, int end) {

        for (int i = start; i <= end; i++) {

            if (arr[i] > val) {

                return i;
            }
        }

        // If no such value(greater than val in subarray) is 
        // encountered, then this return value defines that scenario.
        return end + 1;
    }

    // Accepts an array and also start and end indices of 
    // subarray to search for max and min values within 
    // the subarray.
    public int[] get_max_min_within_indices(int[] arr, int start, int end) {

        int max, min;

        max = min = arr[start];

        for (int i = start + 1; i <= end; i++) {

            if (arr[i] > max) {

                max = arr[i];
            }

            if (arr[i] < min) {

                min = arr[i];
            }
        }

        int[] result = {max, min};

        return result;
    }

    // Returns resulting index.
    public int first_element_greater_than_next_left_to_right(int[] arr) {

        int s = 0;

        for (s = 0; s < arr.length - 1; s++) {

            if (arr[s] > arr[s + 1]) {
                break;
            }
        }

        return s;
    }

    // Returns resulting index.
    public int first_element_lesser_than_next_right_to_left(int[] arr) {

        int e = arr.length - 1;

        for (e = arr.length - 1; e > 0; e--) {

            if (arr[e] < arr[e - 1]) {
                break;
            }
        }

        return e;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        int result = new ShortestUnsortedContinuousSubarray().findUnsortedSubarrayLength(nums);
        System.out.println(result);
    }
}
