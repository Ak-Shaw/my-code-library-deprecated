import java.util.Scanner;
import java.util.*;

class ThreeSum {

    // Implement your solution here
    public List<List<Integer>> threeSum(Integer[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {

            // Skipping Duplicates.
            if (i > 0 && nums[i] == nums[i - 1]) { 
                continue;
            }

            // If we need three numbers to sum up 
            // to 0, that means that we need two numbers 
            // to sum up to the negative of the remaining number.
            // Putting it simply, a + b + c = 0 => b + c = -a
            twoSum(nums, -nums[i], i + 1, result);
        }

        return result;
    }

    // Two pointer approach to solve for two sum problem.
    public void twoSum(Integer[] nums, int required_sum, int first_ptr, List<List<Integer>> result) {

        int second_ptr = nums.length - 1;

        while (first_ptr < second_ptr) {

            int current_sum = nums[first_ptr] + nums[second_ptr];

            if (current_sum == required_sum) {

                result.add(Arrays.asList(-required_sum, nums[first_ptr], nums[second_ptr]));
                first_ptr++;
                second_ptr--;

                // Skipping Duplicates.
                while (nums[first_ptr] == nums[first_ptr - 1] && first_ptr < second_ptr) {
                    first_ptr++;
                }
                while (nums[second_ptr] == nums[second_ptr + 1] && first_ptr < second_ptr) {
                    second_ptr--;
                }

            } else if (current_sum > required_sum) {

                second_ptr--;

            } else {

                first_ptr++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer n = scanner.nextInt();

        Integer nums[] = new Integer[n];

        for(Integer i = 0 ; i < n ;i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        List<List<Integer>> result = new ThreeSum().threeSum(nums);

        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d %d %d\n", result.get(i).get(0), result.get(i).get(1), result.get(i).get(2));
        }
    }
};
