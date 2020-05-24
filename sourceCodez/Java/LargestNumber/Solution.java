import java.util.*;

class Solution {
    public String largestNumber(int[] nums) {
        
        String[] strN = convertIntegerArrayToStringArray(nums);
        
        Arrays.sort(strN, new PlaceValueCompare());
        
        String result = getElementsCombinedAsSingleString(strN);
        
        // If the result starts with 0, it 
        // implies that the input array nums[]
        // contains only zeros.
        if (result.charAt(0) == '0') {
            return "0";
        }
        
        return result;
    }
      
    
    public String getElementsCombinedAsSingleString(String[] strN) {
        
        StringBuilder str = new StringBuilder(100);
        
        for (int i = 0; i < strN.length; i++) {
            
            str.append(strN[i]);
        }
        
        return str.toString();
    }
    
    public String[] convertIntegerArrayToStringArray(int[] nums) {
        
        String[] strN = new String[nums.length];
        
        for (int i = 0; i < nums.length; i++) {
            
            strN[i] = Integer.toString(nums[i]);
        }
        
        return strN;
    }
    
}

class PlaceValueCompare implements Comparator<String> {
    
    // Compares two integer values, accepted as String, 
    // and returns value in favour of which value should be 
    // placed before which.
    // E.g., numS1 = "30" and numS2 = "9"
    // Then we have combo1 = "309" and combo2 = "930"
    // and by comparing we can simply say which value 
    // should be placed before which to form a greater number.
    public int compare(String numS1, String numS2) {
        
        String combo1 = numS1 + numS2;
        String combo2 = numS2 + numS1;
            
        int compareValue = combo2.compareTo(combo1);
        
        return compareValue;
    }
}