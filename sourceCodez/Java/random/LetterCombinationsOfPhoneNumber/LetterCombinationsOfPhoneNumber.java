import java.io.*;
import java.util.*;
import java.lang.*;

public class LetterCombinationsOfPhoneNumber {

    String[][] letters = { { "a", "b", "c", "" }, { "d", "e", "f", "" }, { "g", "h", "i", "" }, { "j", "k", "l", "" }, { "m", "n", "o", "" }, { "p", "q", "r", "s" }, { "t", "u", "v", "" }, { "w", "x", "y", "z" } };
    
    TreeSet<String> result = new TreeSet<>();

    // Implement your solution by completing the below function
    public List<String> letterCombinations(String digits) {

        // int n = Integer.parseInt(digits);
        int l = digits.length();
        int[] d = new int[l];
        int j = 0; 

        for(char i : digits.toCharArray()){
            d[j++] = (int)i - 48 - 2;
        }

        getCombos(d);

        Iterator itr = result.iterator();
        List<String> actualResult = new ArrayList<>();

        while(itr.hasNext()){
            String s = (String)itr.next();
            actualResult.add(s);
        }
        

        return actualResult;
    }

    private void getCombos(int[] d) {
        
        int n = d.length;

        for(int i = 0; i < (int)Math.pow(4, n); i++){

			int j = i;

			String s = "";

			while(j>0){
				 
				int c = j % 4;
				s = c + s;
				j /= 4;
			}

			if(i==0)
				s="0";

			int l = s.length();

			for(int k = 0; k < n - l; k++){
				s=0+s;
			}

            String w="";

			for(int q=0; q<n; q++){
                w+=letters[d[q]][(int)s.charAt(q)-48];
            }

            if(w.length()==n)
            result.add(w);

		}

    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line = in.readLine();
        List<String> combinations = new LetterCombinationsOfPhoneNumber().letterCombinations(line);
        for (String cmbn : combinations)
            System.out.print(cmbn + " ");
    }
}