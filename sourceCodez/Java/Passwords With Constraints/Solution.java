import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	static BufferedWriter log = new BufferedWriter(new OutputStreamWriter(System.out));

	public static void main(String[] args) throws IOException {

    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int k = sc.nextInt();

    	char[] alpha = new char[n];

    	for (int i = 0; i < n; i++) {
    		alpha[i] = sc.next().charAt(0);
    	}

    	char[] spChars = {'#', '$', '&', '@'};

    	HashSet<Integer> chosenAlphaIndices = new HashSet<>();

    	printRestrictedPasswords("", k, alpha, 0, chosenAlphaIndices, spChars, 0, 0);

    	log.flush();

    	System.out.println();
    }

    public static void printRestrictedPasswords(String pass, int k, char[] alpha, int alphaCount, HashSet<Integer> chosenAlphaIndices, char[] spChars, int spCharCount, int passLength) throws IOException {

    	if (passLength == k) {

    		if (alphaCount > 0 && spCharCount > 0) {
    			log.write(pass + " ");
    			
    		}
    	
    	} else {

    		if (!(passLength == k - 1 && spCharCount == k - 1)) {
	    		for (int i = 0; i < 4; i ++) {
	    			printRestrictedPasswords(pass + spChars[i], k, alpha, alphaCount, chosenAlphaIndices, spChars, spCharCount + 1, passLength + 1);
	    		}
	    	}

    		// storing dummy value in lastAlphaRecursedUpon
    		char lastAlphaRecursedUpon = '0';

    		if (!(passLength == k - 1 && alphaCount == k - 1)) {
	    		
	    		for (int i = 0; i < alpha.length; i++)  {

	    			// if (lastAlphaRecursedUpon == alpha[i]) {
	    			// 	continue;
	    			// }

	    			// if (chosenAlphaIndices.contains(i)) {
	    			// 	continue;
	    			// }

	    			if (lastAlphaRecursedUpon != alpha[i] && !chosenAlphaIndices.contains(i)) {
		    			lastAlphaRecursedUpon = alpha[i];
						chosenAlphaIndices.add(i);
						printRestrictedPasswords(pass + alpha[i], k, alpha,  alphaCount + 1, chosenAlphaIndices, spChars, spCharCount, passLength + 1);
						chosenAlphaIndices.remove(i);
					}
	    		}
	    	}
    	}
    }


}