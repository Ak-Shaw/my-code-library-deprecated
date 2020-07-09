class Solution {
    
    public HashMap<Character, Integer> getCharFreqMap(String s) {
        
        HashMap<Character, Integer> charFreqMap = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            
            char c = s.charAt(i);
            
            charFreqMap.put(c, charFreqMap.getOrDefault(c, 0) + 1);
        }
        
        return charFreqMap;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        
        if (s1.length() > s2.length())
            return false;

        HashMap<Character, Integer> charFreqMap = getCharFreqMap(s1);

        int numOfCharsMatched = 0;

        for (int i = 0; i < s1.length(); i++) {

            char c = s2.charAt(i);

            if (charFreqMap.containsKey(c)) {
                charFreqMap.put(c, charFreqMap.get(c) - 1);

                if (charFreqMap.get(c) == 0) {
                    numOfCharsMatched++;
                }
            }
        }

        if (numOfCharsMatched == charFreqMap.size())
            return true;

        for (int ptr1 = 0, ptr2 = s1.length(); ptr2 < s2.length(); ptr1++, ptr2++) {

            char charAtPtr1 = s2.charAt(ptr1);
            char charAtPtr2 = s2.charAt(ptr2);

            if (charFreqMap.containsKey(charAtPtr1)) {
                
                charFreqMap.put(charAtPtr1, charFreqMap.get(charAtPtr1) + 1);

                if (charFreqMap.get(charAtPtr1) == 1)
                    numOfCharsMatched --;
            }

            if (charFreqMap.containsKey(charAtPtr2)) {

                charFreqMap.put(charAtPtr2, charFreqMap.get(charAtPtr2) - 1);

                if (charFreqMap.get(charAtPtr2) == 0)
                    numOfCharsMatched++;
            }

            if (numOfCharsMatched == charFreqMap.size())
                return true;
        }

        return false;

    }
}

/*

if i'm including in the widow -> decrementation -> if dec leads to 0 -> numOfCharsMatched++
if i'm excluding from the window -> incrementation -> if inc leads to 1 from 0 -> numOfCharsMatched--

Time -> O(s2.length())
Space -> O(min(s1.length, 26))
*/