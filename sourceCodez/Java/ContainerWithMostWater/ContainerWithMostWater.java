import java.io.*;
import java.util.*;

class ContainerWithMostWater {
    // complete the below function implementation
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int area = 0;

        while (left < right) {

        	// Max area calculation.
        	area = Math.max(area, Math.min(height[left], height[right]) * (right - left));

        	if (height[left] < height[right]) {

        		left++;

        	} else {

        		right--;
        	}
        }

        return area;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int height[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            height[i] = scanner.nextInt();
        }
        scanner.close();
        int result = new ContainerWithMostWater().maxArea(height);
        System.out.println(result);
    }
}
