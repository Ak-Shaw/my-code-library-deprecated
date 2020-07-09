import java.io.*;
import java.util.*;

class WordLadder {

  public int ladderLength(String beginWord, String endWord, List<String> wordList) {

   Set<String> wordDict = new HashSet<String>(wordList);

   if (!wordDict.contains(endWord)) {
    return 0;
   }

   int l = beginWord.length();

   Set<String> s1 = new HashSet<String>();
   s1.add(beginWord);

   Set<String> s2 = new HashSet<String>();
   s2.add(endWord);

   wordDict.remove(endWord);

   int step = 0;

   while (s1.size() > 0 && s2.size() > 0) {

    step += 1;

    if (s1.size() > s2.size()) {

      Set<String> temp = s1;
      s1 = s2;
      s2 = temp;
    }

    Set<String> s = new HashSet<>();

    for (String w : s1) {

      List<String> new_words = new ArrayList<>();

      for(int i = 0; i < l; i++) {

        for (int t = 97; t < 123; t++) {

          new_words.add(w.substring(0, i) + (char)t + w.substring(i + 1));
        }
      }

      for (String new_word : new_words) {

        if (s2.contains(new_word)) return step + 1;

        if (!wordDict.contains(new_word)) continue;

        wordDict.remove(new_word);

        s.add(new_word);
      }

      s1 = new HashSet<String>(s);
    }

   }

   return 0;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String beginWord = scanner.nextLine();
    String endWord = scanner.nextLine();

    int n = scanner.nextInt();
    List<String> wordList = new ArrayList<String>();

    for (int i = 0; i < n; ++i) {
      String word = scanner.next();
      wordList.add(word);
    }
    scanner.close();
    int result = new WordLadder().ladderLength(beginWord, endWord, wordList);
    System.out.println(result);
  }
}

