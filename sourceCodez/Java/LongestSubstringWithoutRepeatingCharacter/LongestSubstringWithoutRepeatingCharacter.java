import java.util.*;

class LongestSubstringWithoutRepeatingCharacter {
    
    public int lengthOfLongestSubstring(String s) {

        if (s.length() <= 1) {

        	return s.length();
        }

        Set<Character> set = new HashSet<>();

        int window_start_ptr = 0, window_end_ptr = 0, max_substring_len = 0;

        // 1. Add a character to window and set.
        // 2. Store max set.size() as max_substring_len.
        // 3. Calculate current_window_size.
        // 4. While current_window_size > size of set:
        //		a. Remove character pointed by window_start_ptr.
        //		b. Increment window_start_pointer.
        //		c. Add the last added character to the set, 
        //		   in case the character gets removed from set.
        //		   E.g., if window has "abca".
        //		d. Decrement current_window_size.
        // 5. Return max_substring_len
        for (; window_end_ptr < s.length(); window_end_ptr++) {

        	char newChar = s.charAt(window_end_ptr);

        	set.add(newChar);

        	max_substring_len = Math.max(max_substring_len, set.size());

        	int current_window_size = window_end_ptr - window_start_ptr + 1;

        	while (current_window_size > set.size()) {

        		set.remove(s.charAt(window_start_ptr++));

        		// Adding last added character, incase it gets removed.
        		set.add(newChar);

        		current_window_size--;
        	}
        }

        return max_substring_len;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int result = new LongestSubstringWithoutRepeatingCharacter().lengthOfLongestSubstring(s);
        System.out.println(result);
    }
}
