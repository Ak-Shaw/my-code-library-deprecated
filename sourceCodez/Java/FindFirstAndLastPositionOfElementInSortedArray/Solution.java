import java.util.*;

public class Solution {

    public int[] searchRange(int[] nums, int target) {
        int answer[] = new int[2];

        answer[0] = findFirstOccurrence(nums, 0, nums.length -1, target, nums.length);

        answer[1] = findLastOccurrence(nums, 0, nums.length -1, target, nums.length);

        return answer;
    }

    public static int findFirstOccurrence(int arr[], int low, int high, int x, int n) 
    { 
        if(high >= low) 
        { 
            int mid = low + (high - low)/2; 
            if( ( mid == 0 || x > arr[mid-1]) && arr[mid] == x) 
                return mid; 
             else if(x > arr[mid]) 
                return findFirstOccurrence(arr, (mid + 1), high, x, n); 
            else
                return findFirstOccurrence(arr, low, (mid -1), x, n); 
        } 
    return -1; 
    } 

    public static int findLastOccurrence(int arr[], int low, int high, int x, int n) 
    { 
        if (high >= low) 
        { 
            int mid = low + (high - low)/2; 
            if (( mid == n-1 || x < arr[mid+1]) && arr[mid] == x) 
                 return mid; 
            else if (x < arr[mid]) 
                return findLastOccurrence(arr, low, (mid -1), x, n); 
            else
                return findLastOccurrence(arr, (mid + 1), high, x, n); 
        } 
    return -1; 
    } 
}
