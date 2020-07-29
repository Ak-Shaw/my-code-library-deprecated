import java.util.*;

class SplitTheMonsters {

    // Function to check if mid can 
    // be maximum sub - arrays sum 
    static boolean check(long mid, long array[], int n, int K) 
    { 
        
        long count = 0; 
        long sum = 0; 
        for (int i = 0; i < n; i++) 
        { 
    
            // If individual element is greater 
            // maximum possible sum 
            if (array[i] > mid) 
                return false; 
    
            // Increase sum of current sub - array 
            sum += array[i]; 
    
            // If the sum is greater than 
            // mid increase count 
            if (sum > mid) 
            { 
                count++; 
                sum = array[i]; 
            } 
        } 
        count++; 
    
        // Check condition 
        if (count <= K) 
            return true; 
        return false; 
    } 
    
    // Function to find maximum subarray sum 
    // which is minimum 
    static long splitTheMonsters(int n, int K, long[] array) 
    { 
        long start = 1; 
        long end = 0; 
    
        for (int i = 0; i < n; i++) 
        { 
            end += array[i]; 
        } 
    
        // Answer stores possible 
        // maximum sub array sum 
        long answer = 0; 
        while (start <= end) 
        { 
            long mid = (start + end) / 2; 
    
            // If mid is possible solution 
            // Put answer = mid; 
            if (check(mid, array, n, K)) 
            { 
                answer = mid; 
                end = mid - 1; 
            } 
            else
            { 
                start = mid + 1; 
            } 
        } 
    
        return answer; 
    } 

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        assert(n <= 100000 && n >= 1);
        assert(m <= Math.min(100000,n) && m >= 1);
        long powers[] = new long[n];
        for(int i = 0 ; i < n ; i++) {
            powers[i] = scanner.nextLong();
            assert(Math.abs(powers[i]) <= 100000000);
        }
        long result = new SplitTheMonsters().splitTheMonsters(n , m , powers);
        System.out.println(result);
    }
}