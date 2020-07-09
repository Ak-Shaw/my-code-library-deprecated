import java.util.*;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
        Arrays.sort(arr);
        
        return isAP(arr);
    }
    
    public boolean isAP(int[] arr) {
        
        int commonDiff = arr[1] - arr[0];
        
        for (int i = 2; i < arr.length; i++) {
            
            if (arr[i] - arr[i - 1] != commonDiff) {
                return false;
            }
        }
        
        return true;
    }
}