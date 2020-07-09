/*
Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 
as one sorted array.
Note:
The number of elements initialized in nums1 and nums2 are m and n 
respectively.
You may assume that nums1 has enough space (size that is greater or 
equal to m + n) to hold additional elements from nums2.

Example:

Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3

Output: [1,2,2,3,5,6]
*/

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
		int p1 = m - 1; // pointer for nums1
		int p2 = n - 1; // pointer for nums2
		int p3 = m + n - 1; // pointer for placing values in nums1
		
		// performing merge
		while (p1 >= 0 && p2 >= 0) { 
			
			if (nums1[p1] >= nums2[p2])	 {

				nums1[p3] = nums1[p1];

				p3--;
				p1--;
			
			} else {

				nums1[p3] = nums2[p2];

				p3--;
				p2--;
			}
		}

		// No need since it's already in place
		// if (p1 >= 0) {
		// 	fillRemaining(nums1, nums1, p1);
		// }

		if (p2 >= 0) {
			fillRemaining(nums1, nums2, p2);
		}
	}

	// To fill the remaining elements of either of the nums array
	public void fillRemaining(int[] toBeFilled, int[] source, int ptr) {

		while (ptr >= 0) {

			toBeFilled[ptr] = source[ptr];
            ptr--;
		}
	}

}
