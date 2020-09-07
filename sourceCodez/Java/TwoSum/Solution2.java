import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int i = 0;
        for (int n : nums) {
            
            if (map.containsKey(target - n)) {
                return new int[]{map.get(target - n), i};
            } else {
                map.put(n, i++);
            }
        }
        
        return new int[]{0, 0};
    }
}
