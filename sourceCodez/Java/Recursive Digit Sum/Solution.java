import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the superDigit function below.
    static int superDigit(String n, int k) {

        long initialValue = getSumFromIntegerString(n) * k;
        
        return (int)superDigitHelper(initialValue);
    }
    
    static long getSumFromIntegerString(String n) {
        
        long sum = 0;
        
        for (int i = 0; i < n.length(); i++) {
            sum += (n.charAt(i) - 48);
        }
        
        return sum;
    }
    
    static long superDigitHelper(long n) {
        
        if (isSingleDigit(n)) {
            return n;
        }
        
        return superDigitHelper(getSum(n));
    }
    
    static boolean isSingleDigit(long n) {
        
        //int lastDigit = n % 10;
        long remaining = n / 10;
        
        if (remaining == 0) {
            return true;
        }
        
        return false;
    }
    
    static long getSum(long n) 
    { 
        long sum; 
  
        /* Single line that calculates sum */
        for (sum = 0; n > 0; sum += n % 10, 
                                  n /= 10); 
  
        return sum; 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
