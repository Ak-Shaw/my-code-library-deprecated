class Solution {
    public int removeDuplicates(int[] nums) {
        
        int uniqueElementsPtr = 1;
        
        for (int ptr = 1; ptr < nums.length; ptr++) {
            
            if (nums[uniqueElementsPtr - 1] != nums[ptr]) {
                nums[uniqueElementsPtr] = nums[ptr];
                uniqueElementsPtr++;
            }
        }
        
        return uniqueElementsPtr;
    }
}