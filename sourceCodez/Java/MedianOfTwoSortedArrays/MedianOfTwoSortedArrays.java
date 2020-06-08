import java.io.*;
import java.util.*;

class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2 , int m, int n) {

    	if (m > n) {

    		return findMedianSortedArrays(nums2, nums1, n, m);
    	}

    	int lowAPtr = 0, highAPtr = m, sizeLeftTotal = (m + n + 1) / 2;

    	while (lowAPtr <= highAPtr) {

    		int sizeLeftA = (lowAPtr + highAPtr) / 2;
    		int sizeLeftB = sizeLeftTotal - sizeLeftA;
    		int maxLeftA = (sizeLeftA == 0) ? Integer.MIN_VALUE : nums1[sizeLeftA - 1];
    		int maxLeftB = (sizeLeftB == 0) ? Integer.MIN_VALUE : nums2[sizeLeftB - 1];
    		int minRightA = (sizeLeftA == m) ? Integer.MAX_VALUE : nums1[sizeLeftA];
    		int minRightB = (sizeLeftB == n) ? Integer.MAX_VALUE : nums2[sizeLeftB];

    		if (maxLeftA <= minRightB && maxLeftB <= minRightA) {

    			if ((m + n) % 2 == 0) {
    				double median = Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB);
    				median = median / 2.0;
    				return median;
    			
    			} else {
    				double median = Math.max(maxLeftA, maxLeftB);
    				return median;
    			}
    		}

    		else if (maxLeftA > minRightB) {

    			highAPtr = sizeLeftA - 1;
    		
    		} else {

    			lowAPtr = sizeLeftA + 1;
    		}
    	}

        return 0.0;
    }
    public static void main(String args[]) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int nums1[] = new int[m];
        for(int i = 0 ; i < m ; i++) {
            nums1[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int nums2[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            nums2[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        for(int i = 0 ; i < q ; i++) {
            int size1 = scanner.nextInt();
            int size2 = scanner.nextInt();
            double result = new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1,nums2,size1,size2);
            System.out.println(result);
        }
        scanner.close();
    }
}
