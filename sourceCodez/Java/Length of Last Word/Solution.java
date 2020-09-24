class Solution {
    public int lengthOfLastWord(String s) {
        
        if (s.isEmpty()) {
            return 0;
        }
        
        s = ' ' + s;
        
        int requiredVal;
        
        // If the string has trailing spaces OR has only spaces.
        if (s.charAt(s.length() - 1) == ' ') {
            String[] words = s.split(" ");
            
            // If the string consists of only spaces.
            if (words.length == 0) {
                return 0;
            }
            
            return words[words.length - 1].length();
        }
        
        // If the string has no trailing spaces.
        requiredVal = s.length() - s.lastIndexOf(' ') - 1;
        return requiredVal;
    }
}