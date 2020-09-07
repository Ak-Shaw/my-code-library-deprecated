class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0) {
            return false;
        }
        
        int rev = reverse(x);
        
        if (x == rev) {
            return true;
        }
        
        return false;
    }
    
    public int reverse(int n) {
        
        int rev = 0;
        
        while (n != 0) {
            
            rev = rev * 10 + n % 10;
            
            n /= 10;
        }
        
        return rev;
    }
}