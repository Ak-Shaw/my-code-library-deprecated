import java.io.*;
import java.util.*;

public class MajorityElement {

    public int majorityElement(int[] nums) {

        // Get frequency map of nums[].
        HashMap<Integer, Integer> freqMap = getFrequencyMap(nums);

        // Iterate over the keys to find the majority element.
        for (int key : freqMap.keySet()) {

            int value = freqMap.get(key);

            if (value > Math.floor(nums.length / 2)) {
                return key;
            }
        }

        // Return -1 if not found.
        return -1;
    }

    public HashMap<Integer, Integer> getFrequencyMap(int[] nums) {

        HashMap<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }

        return freqMap;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        scanner.close();

        int result = new MajorityElement().majorityElement(numbers);
        System.out.print(Integer.toString(result));
    }
}
