import java.util.*;

class Solution {
    
    public int getLastMoment(int n, int[] left, int[] right) {
        
        Arrays.sort(left);
        Arrays.sort(right);
        
        if (left.length == 0) {
            return getLastMomentForRight(n, right);
        } else if (right.length == 0) {
            return getLastMomentForLeft(n, left);
        }
        
        int leftMostOfRight = right[0];
        int rightMostOfLeft = left[left.length - 1];
        
        // The lesser the value, the farther away it is from the other end.
        int anti_farthest_for_left_most_of_right = leftMostOfRight;
        int anti_farthest_for_right_most_of_left = n - rightMostOfLeft;
        
        if (anti_farthest_for_left_most_of_right < anti_farthest_for_right_most_of_left) {
            
            return n - leftMostOfRight;
        } else {
            return rightMostOfLeft;
        }
        
    }
    
    public int getLastMomentForRight(int n, int[] right) {
        
        int positionOfLeftMost = right[0];
        
        return n - positionOfLeftMost;
    }
    
    public int getLastMomentForLeft(int n, int[] left) {
        
        int positionOfRightMost = left[left.length - 1];
        
        return positionOfRightMost;
    }
    
}