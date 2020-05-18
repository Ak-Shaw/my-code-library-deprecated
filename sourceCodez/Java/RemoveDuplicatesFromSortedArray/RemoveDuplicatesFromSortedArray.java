import java.io.*;
import java.util.*;

public class RemoveDuplicatesFromSortedArray {
    // Implement your solution by completing the below function
    public int removeDuplicates(int[] nums) {

        return getUniqueValueCount(nums);
    }

    // To get the number of unique values 
    // in a sorted array.
    public int getUniqueValueCount(int[] nums) {

        // In case empty array is accepted.
        if (nums.length == 0 ) {
            return 0;
        }

        // To store the number of unique values.
        int valueCount = 1;

        // Using two pointers
        int p1 = 0;
        int p2 = 1;

        while (p2 < nums.length) {

            // Case when the two pointers encounter same value.
            if (nums[p1] == nums[p2]) {

                // Traverse the array till either we 
                // reach the end or either we meet the next 
                // value.
                while (p2 < nums.length && nums[p1] == nums[p2]) {

                    p2++;

                }

                p1 = p2;
                p2++;

                // If we've not reached the end of the array 
                // then it means that we've encountered a new value.
                if (p1 < nums.length) {

                    valueCount++;

                }

            } else { // Case of encountering a new value.

                p1++;
                p2++;
                valueCount++;
            }
        }

        return valueCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        scanner.close();

        int result = new RemoveDuplicatesFromSortedArray().removeDuplicates(numbers);
        System.out.print(Integer.toString(result));
    }
}
