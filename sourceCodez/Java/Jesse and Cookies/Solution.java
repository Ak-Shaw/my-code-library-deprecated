import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    
    static PriorityQueue<Integer> cookies = new PriorityQueue<>();
    
    static int cookies(int k, int[] A) {
        
        populateCookies(A);
        
        int count = 0;
        
        while (cookies.size() > 1 && cookies.peek() < k) {
            
            calculateSweetnessAndAddNewCookie();
            count++;
        } 
        
        if (cookies.peek() >= k) 
            return count;
        
        return -1;
    }
    
    static void populateCookies(int[] A) {
        
        for (int i = 0; i < A.length; i++) {
            cookies.add(A[i]);
        }
    }
    
    static void calculateSweetnessAndAddNewCookie() {
        
        int leastSweetCookie = cookies.poll();
        int secondLeastSweetCookie = cookies.poll();
        
        int sweetness = leastSweetCookie + 2 * secondLeastSweetCookie;
        
        cookies.add(sweetness);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] A = new int[n];

        String[] AItems = scanner.nextLine().split(" ");

        for (int AItr = 0; AItr < n; AItr++) {
            int AItem = Integer.parseInt(AItems[AItr].trim());
            A[AItr] = AItem;
        }

        int result = cookies(k, A);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();
    }
}
