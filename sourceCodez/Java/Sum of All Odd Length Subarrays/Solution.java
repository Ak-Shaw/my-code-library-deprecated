class Solution {
    
    public int sumOddLengthSubarrays(int[] arr) {
        
        int sum = 0;
        
        for (int i = 1; i <= arr.length; i += 2) {
            sum += sumOfAllWindows(arr, i);
        }
        
        return sum;
    }
    
    // Accepts an array and a value n as the 
    // window size and returns the sum of all 
    // the windows of size n.
    // e.g., arr = [1,4,2,5,3] and n = 3
    // then the returned value will be 
    // (1 + 4 + 2) + (4 + 2 + 5) + (2 + 5 + 3)
    public int sumOfAllWindows(int[] arr, int n) {
        
        int sum = 0;
        
        int low = 0;
        int high = n;
        
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        int currentWindowSum = sum;
        
        for (; high < arr.length; low++, high++) {
            
            currentWindowSum = currentWindowSum - arr[low] + arr[high];
            
            sum += currentWindowSum;
        }
        
        return sum;
    }
}