import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	int n = sc.nextInt();
    	int q = sc.nextInt();

    	String s = sc.next();

    	int[][] freqMap = getFreqMap(n, s);

    	char[] result = new char[q];

    	for (int i = 0; i < q; i++) {

    		result[i] = getResultOfQuery(freqMap, sc.nextInt(), sc.nextInt(), sc.nextInt());
    	}

    	for(int i = 0; i < q; i++) {
    		System.out.println(result[i]);
    	}
    }

    static char getResultOfQuery(int[][] freqMap, int l, int r, int k) {

    	int j;

    	for (j = 0; j < 26; j++) {

    		k -= freqMap[r][j];

    		if (l - 1 >= 0) {

    			k += freqMap[l - 1][j];
    		}

    		if (k <= 0) break;
    	}
    	
    	return (char)(97 + j);
    }

    static int[][] getFreqMap(int n, String s) {

    	int[][] freqMap = new int[n + 1][26];

    	for(int i = 1; i <= n; i++) {

    		if (i != 1) {

    			for (int j = 0; j < 26; j++) {
    				freqMap[i][j] = freqMap[i - 1][j];
    			}
    		}

    		char c = s.charAt(i - 1);

    		int characterNumber = (int)c - 96;

    		freqMap[i][characterNumber - 1]++;
    	}

    	return freqMap;
    }
}