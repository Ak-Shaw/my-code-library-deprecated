import java.util.*;

public class Solution {

	public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        List<int[]> stack = new ArrayList<>(); // list of pair: [index, height]
        
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            
            while (stack.size() > 0 && stack.get(stack.size() - 1)[1] > heights[i]) {
                int height = stack.get(stack.size() - 1)[1];
                int width = i - stack.get(stack.size() - 1)[0];
                maxArea = Math.max(maxArea, height * width);
                start = stack.get(stack.size() - 1)[0];
                stack.remove(stack.size() - 1);
            }
            stack.add(new int[]{start, heights[i]});
        }
        for (int i = 0; i < stack.size(); i++) {
            int height = stack.get(i)[1], start = stack.get(i)[0];
            int area = height * (heights.length - start);
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);

    	int g = sc.nextInt();

    	int b = sc.nextInt();

    	int h = sc.nextInt();

    	int[] lengths = new int[g];

    	for (int i = 0; i < g; i++) {
    		lengths[i] = sc.nextInt();
    	}

    	int maxAreaTakingUnitBreadth = largestRectangleArea(lengths);

    	int mod = 1000000007;

    	int volOfLargestCuboid = moduloMutiplicationOf3(b, h, maxAreaTakingUnitBreadth, mod);

    	int result = - volOfLargestCuboid;

    	for (int i = 0; i < g; i++) {

    		int vol = moduloMutiplicationOf3(b, h, lengths[i], mod);

    		result = moduloAdditionOf2(result, vol, mod);
    	}

    	System.out.println(result);
    }

    static int moduloAdditionOf2(int a, int b, int c) {

    	return ( ( a % c ) + ( b % c ) ) % c;
    }

    static int moduloMutiplicationOf3(int a, int b, int c, int mod) {

    	int d = moduloMutiplicationOf2(a, b, mod);

    	int e = moduloMutiplicationOf2(d, c, mod);

    	return e;

    }

    static int moduloMutiplicationOf2(int a, int b, int c) {

    	return ( ( a % c ) * ( b % c ) ) % c;
    }
}