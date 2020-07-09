import java.util.*;

class Solution {
    public void sortColors(int[] nums) {
        
        HashMap<Integer, Integer> freqMap = getColorFreq(nums);
        
        int ptr = 0; // points to the start index of next colour to be filled
        
        for (int i = 0; i <= 2; i++) {
            
            if (freqMap.containsKey(i)) {
                fillColor(ptr, ptr + freqMap.get(i) - 1, nums, i);
                ptr += freqMap.get(i);
            }
        }
    }
    
    public void fillColor(int startIndex, int endIndex, int[] nums, int color) {
        
        for (int i = startIndex; i <= endIndex; i++) {
            nums[i] = color;
        }
    }
    
    public HashMap<Integer, Integer> getColorFreq(int[] nums) {
        
        // Contains the frequencies as a map for 
        // keys 0, 1 and 2
        HashMap<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            freqMap.put(nums[i], freqMap.getOrDefault(nums[i], 0) + 1);
        }
        
        return freqMap;
    }
}
