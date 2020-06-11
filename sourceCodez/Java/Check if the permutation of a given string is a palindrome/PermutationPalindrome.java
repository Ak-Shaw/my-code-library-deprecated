import java.io.*;
import java.util.*;
import java.lang.Math;
public class  PermutationPalindrome {

  public static int isPermutationPalindrome(String s ) {

    int size = s.length();
    int oddCount = 0;
    int i = 0;

    HashMap<Character, Integer> count = new HashMap<Character, Integer>();

    while (i < size) {
      char x = s.charAt(i);
      count.put(x, count.getOrDefault(x, 0) + 1);
      i++;
    }

    for (char it : count.keySet()) {

      int x = count.get(it);

      if (x % 2 == 1) 
        oddCount++;
    }

    if (oddCount > 1)
      return 0;

    return 1;
  }

  public static void  main (String args []) {

    Scanner sc =  new  Scanner (System.in);
    int t = 1;
    t = sc.nextInt();
    sc.nextLine();
    while (t > 0) {
      t--;
      String s = new String();
      s = sc.next();

      int flag = isPermutationPalindrome(s);
      if (flag == 1) {
        System.out.println("True");
      } else {
        System.out.println("False");
      }
    }
  }

}
