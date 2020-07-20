import java.io.*;
import java.util.*;
class DecodeWays {
    
    public int numDecodings(String s) { 

    	int mod = 1000000007;

    	// Table to store the results
    	int[] table = new int[s.length() + 1]; // +1 to index string positions from 1
    	table[0] = 1; // Initialize first value to be used to construct other values
    	
    	if (s.charAt(0) == '0')
    		table[1] = 0;
    	else table[1] = 1;

    	for (int i = 2; i < table.length; i++) {
    		if (s.charAt(i - 1) != '0') { // Single digit is a valid option
    			table[i] += table[i - 1] % mod;
    		}

    		int twoDigit = Integer.valueOf(s.substring(i - 2, i));

    		if (twoDigit >= 10 && twoDigit <= 26) { // Double digit is a valid option
    			table[i] += table[i - 2] % mod;
    		}
    	}

    	return table[s.length()] % mod; // Last position holds the answer
    }
    
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        int result = new DecodeWays().numDecodings(s);
        System.out.println(result);
     }
}
