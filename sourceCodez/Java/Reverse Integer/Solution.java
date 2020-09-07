class Solution {
    public int reverse(int x) {
        
        boolean negative = false;
        long y = x;
        
        if (x < 0) {
            negative = true;
            y = -y;
        }
        
        StringBuffer buf = new StringBuffer(Long.toString(y));
        buf.reverse();
        
        String rev = buf.toString();
        
        long revLongInt = Long.parseLong(rev);
        
        if (revLongInt > Integer.MAX_VALUE || revLongInt < Integer.MIN_VALUE) {
            return 0;
        }
        
        if (negative) {
            return -(int)revLongInt;
        }
        
        return (int)revLongInt;
    }
}