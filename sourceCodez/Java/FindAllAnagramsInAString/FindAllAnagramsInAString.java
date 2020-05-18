import java.util.*;

// Implement your solution here
class FindAllAnagramsInAString {
    public List<Integer> findAnagrams(String str, String pattern) {
        
        List<Integer> result = new ArrayList<>();

        Map<Character, Integer> char_frequency_hash = populateHashMapCharFrequency(pattern);
        int window_start_ptr = 0, window_end_ptr = 0, num_chars_matched = 0;

        for (; window_end_ptr < str.length(); window_end_ptr++) {

            char end_char = str.charAt(window_end_ptr);

            if (char_frequency_hash.containsKey(end_char)) {

                char_frequency_hash.put(end_char, char_frequency_hash.get(end_char) - 1);

                if (char_frequency_hash.get(end_char) == 0)
                    num_chars_matched++;
            }

            if (num_chars_matched == char_frequency_hash.size())
                result.add(window_start_ptr);

            if (window_end_ptr >= pattern.length() - 1) {

                char start_char = str.charAt(window_start_ptr++);

                if (char_frequency_hash.containsKey(start_char)) {
                    if (char_frequency_hash.get(start_char) == 0)
                        num_chars_matched--;

                    char_frequency_hash.put(start_char, char_frequency_hash.get(start_char) + 1);
                }
            }
        }

        return result;

    }

    public static Map<Character, Integer> populateHashMapCharFrequency(String pattern) {

        Map<Character, Integer> hash = new HashMap<>();
        for (char character : pattern.toCharArray())
            hash.put(character, hash.getOrDefault(character, 0) + 1);

        return hash;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    String[] input = new String[2]; 
    input = scanner.nextLine().split(" ");
        String s = input[0];
        String p = input[1];
        scanner.close();

        List<Integer> result = new FindAllAnagramsInAString().findAnagrams(s,p);
    System.out.println(result.size());
        for (Integer i = 0; i < result.size(); ++i) {
            System.out.printf("%d ", result.get(i));
        }
    }
}
