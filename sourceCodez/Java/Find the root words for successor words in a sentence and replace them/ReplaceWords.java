import java.util.*;

public class ReplaceWords {

	public static class Node {

		boolean end;
		Node[] child;
		Node() {
			child = new Node[26];
		}
	}

    public static String replaceWords(ArrayList<String>dict, String sentence){
    
    	StringBuilder ans = new StringBuilder();
    	Node head = new Node();
    	for (String key : dict) { // Insert each dict word into Trie
    		Node cur = head;
    		for (char ch : key.toCharArray()) {
    			if (cur.child[ch - 'a'] == null) {
    				cur.child[ch - 'a'] = new Node();
    			}
    			cur = cur.child[ch - 'a'];
    		}
    		cur.end = true; // Mark leaf node as end of word
    	}
    	for (String word : sentence.split("\\s+")) { // For each word in sentence
    		Node cur = head;
    		StringBuilder temp = new StringBuilder();
    		for (char ch : word.toCharArray()) { // For each char in word
    			if (cur.end) break; // Skip letters if root word found
    			if (cur.child[ch - 'a'] != null) {
    				cur = cur.child[ch - 'a'];
    			}
    			else { // Word doesn't exist in trie
    				temp.delete(0, temp.length()); 	// Remove partial word
    				temp.append(word); break;		// Add full word as is & break
    			}
    			temp.append(ch); // Append each letter of word
    		}
    		temp.append(" ");
    		ans.append(temp); // Add the word to answer
    	}
    	return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String>dict = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            dict.add(sc.next());
        }
        String sentence = sc.nextLine();
        sentence = sc.nextLine();
        String ans = replaceWords(dict,sentence);
        System.out.print(ans);
        sc.close();
    }    
}
