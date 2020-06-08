import java.util.*;

public class PalindromePartitioning {
    
    ArrayList<ArrayList<String> > palindromePartitioning(String s) {
    
        ArrayList<ArrayList<String>> partitions = new ArrayList<ArrayList<String>>();

        partition(s, partitions);

        return partitions;
    }

    // Generates all palindromic partitions of 's' and stores the result in 'v'

    void partition(String s, ArrayList<ArrayList<String>> v) {

        ArrayList<String> temp = new ArrayList<String>();

        // Calling addStrings method. It adds all the palindromic partitions to v

        v = addStrings(v, s, temp, 0);
    }

    ArrayList<ArrayList<String>> addStrings(ArrayList<ArrayList<String>> v, String s, ArrayList<String> temp, int index) {

        int len = s.length();

        String str = "";

        // initialize to current temp
        ArrayList<String> current = new ArrayList<String>(temp);

        if (index == 0) {
            temp.clear();
        }

        // Iterate over the string

        for (int i = index; i < len; i++) {

            str += s.charAt(i);

            // check whether the substring is palindrome or not

            if (isPalindrome(str)) {

                // if palindrome, add it to temp list
                temp.add(str);

                if (i + 1 < len) {

                    v = addStrings(v, s, temp, i + 1);
                
                } else {

                    // if end of the string is reached add temp to v
                    v.add(temp);
                }

                // temp is reinitialized with the current i.
                temp = new ArrayList<String>(current);

            }
        }

        return v;
    }

    // Function that returns true if 
    // str is a palindrome 
    static boolean isPalindrome(String str) 
    { 
  
        // Pointers pointing to the beginning 
        // and the end of the string 
        int i = 0, j = str.length() - 1; 
  
        // While there are characters toc compare 
        while (i < j) { 
  
            // If there is a mismatch 
            if (str.charAt(i) != str.charAt(j)) 
                return false; 
  
            // Increment first pointer and 
            // decrement the other 
            i++; 
            j--; 
        } 
  
        // Given string is a palindrome 
        return true; 
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        ArrayList<ArrayList<String> > result = new PalindromePartitioning().palindromePartitioning(s);
        for(int i = 0 ; i < result.size() ; i++) {
            for(int j = 0 ; j < result.get(i).size() ; j++) {
                System.out.print(result.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
