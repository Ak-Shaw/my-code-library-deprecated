import java.io.*;
import java.util.*;

class SearchA2DMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];
        for(int i = 0 ; i < rows ; ++i) {
            for(int j = 0 ; j < columns ; ++j) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int queries = scanner.nextInt();

        for(int i = 0 ; i < queries ; ++i) {
            int target = scanner.nextInt();
            boolean result = new Solution().searchMatrix(matrix , target);
            System.out.println(result);
        }
        scanner.close();
    }
}
