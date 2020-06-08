import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int k = sc.nextInt();

    	long[] elements = new long[n];
    	int[] powersOfElements = new int[n];

    	for (int i = 0; i < n; i++) {

    		elements[i] = sc.nextLong();

    		if (elements[i] < 0) {
    			powersOfElements[i] = -countNumberOfOneBits(Math.abs(elements[i]));
    		} else {
    			powersOfElements[i] = countNumberOfOneBits(elements[i]);
    		}
    	}

    	int currentSum = 0;
    	
    	for (int i = 0; i < k; i++) {
    		currentSum += powersOfElements[i];
    	}

    	int maxSum = currentSum;

    	int windowStartPtr = 0, windowEndPtr = k;

    	for(; windowEndPtr < n; windowEndPtr++) {

    		currentSum -= powersOfElements[windowStartPtr++];
    		currentSum += powersOfElements[windowEndPtr];

    		maxSum = Math.max(maxSum, currentSum);
    	}

    	System.out.println(maxSum);
    }

    public static int countNumberOfOneBits(long num) {

        int count = 0;

        while (num != 0) {

            if ((num & 1) == 1) {

                count++;
            }

            num >>= 1;
        }

        return count;
    }
}