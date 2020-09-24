class Solution {

    /**
    Algorithm

    When we encounter nums[i] = valnums[i]=val, we can swap 
    the current element out with the last element and dispose 
    the last one. This essentially reduces the array's size by 1.

    Note that the last element that was swapped in could be the 
    value you want to remove itself. But don't worry, in the next 
    iteration we will still check this element.
    */
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                // reduce array size by one
                n--;
            } else {
                i++;
            }
        }
        return n;
    }
}
