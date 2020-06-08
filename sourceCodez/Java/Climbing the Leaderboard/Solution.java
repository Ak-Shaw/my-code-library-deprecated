import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {

        ArrayList<Integer> scoresList = removeDuplicatesAndGetArrayList(scores);
        
        int[] result = new int[alice.length];
        
        int j = 0;
        
        for (int score : alice) {
            
            result[j++] = insertScoreAndGetRank(scoresList, score);
        }
        
        return result;
    }
    
    static int insertScoreAndGetRank(ArrayList<Integer> scoresList, int score) {
        
        if (score > scoresList.get(0)) {
            
            scoresList.add(0, score);
            return 1;
        }
        
        if (score < scoresList.get(scoresList.size() - 1)) {
            
            scoresList.add(score);
            return scoresList.size();
        }
        
        int searchResult = binarySearch(scoresList, score);
        
        if (searchResult != -1) {
            
            return searchResult + 1;
        }
        
        int insertIndex = getScoreInsertionIndex(scoresList, score);
        
        scoresList.add(insertIndex, score);
        
        return insertIndex + 1;
    }
    
    static int getScoreInsertionIndex(ArrayList<Integer> scoresList, int score) {
        
        int lb = 0, ub = scoresList.size() - 1, mid;
        
        while (lb <= ub) {
            
            mid = lb + (ub - lb) / 2;
            
            if (scoresList.get(mid + 1) < score && scoresList.get(mid) > score) {
                return mid + 1;
            }
            
            if (score > scoresList.get(mid)) {
                ub = mid - 1;
            } else {
                lb = mid + 1;
            }
        }
        
        // According to our given problem statement
        // this scenario will not be met.
        return -1;
    }
    
    // Here the input list is sorted in descending order.
    static int binarySearch(ArrayList<Integer> list, int ele) {
        
        int lb = 0, ub = list.size() - 1, mid;
        
        while (lb <= ub) {
            
            mid = lb + (ub - lb) / 2;
            
            if (list.get(mid) == ele) {
                
                return mid;
            }
            
            if (ele < list.get(mid)) {
                lb = mid + 1;
            } else {
                ub = mid - 1;
            }
        }
        
        return -1;
    }
    
    static ArrayList<Integer> removeDuplicatesAndGetArrayList(int[] arr) {
        
        int unique_elements_ptr = 1;
        
        for (int ptr = 1; ptr < arr.length; ptr++) {
            
            if (arr[unique_elements_ptr - 1] != arr[ptr]) {
                arr[unique_elements_ptr++] = arr[ptr];
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 0; i < unique_elements_ptr; i++) {
            
            result.add(arr[i]);
        }
        
        return result;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
