import java.util.*;

public class CharacterFrequency {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("String: ");
		String s = sc.nextLine();

		HashMap<Character, Integer> freqMap = getCharacterFrequency(s);

		System.out.println("Charcters and their frequencies are as follows:\n");

		// for (int i = 0; i < 256; i++) {

		// 	if (freqMap.containsKey((char)i)) {
		// 		System.out.println((char)i + " => " + freqMap.get((char)i));
		// 	}
		// }

		for (char character : freqMap.keySet()) {
			
			System.out.println(character + " => " + freqMap.get(character));
			
		}
	}

	public static HashMap<Character, Integer> getCharacterFrequency(String s) {

		HashMap<Character, Integer> freqMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);

			freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
		}

		return freqMap;
	}
}