import java.util.*;

public class NQueens {
    
    String answer;

    String nQueens(int n) {
        
        answer = new String(); // answer is a global variable
        int[] queen_columns = new int[n];
        getQueenPositions(0, queen_columns, n); // Main method
        boolean is_answer = false;
        for (int i = 0; i < answer.length(); i++) {
            if (answer.charAt(i) == '1') {
                is_answer = true;
                break;
            }
        }
        if (is_answer == false) return "No Solution Exists";
        return answer;
    }

    void getQueenPositions(int current_row, int[] queen_columns, int n) {

        if (current_row == n) { // A solution has been found
            appendToAnswerString(queen_columns, n);
            return;
        }

        // Try out each column as a possible position for the current_row
        for (int column = 0; column < n; column++) {
            if (isValidPosition(column, current_row, queen_columns, n)) {
                queen_columns[current_row] = column;
                // Good so far, check if next queen can find a position.
                getQueenPositions(current_row + 1, queen_columns, n);
            }
        }
    }

    boolean isValidPosition(int current_column, int current_row, int[] queen_columns, int n) {

        boolean is_valid = true;
        for (int j = 0; j < current_row; j++) {
            // Check for column being taken in previous rows
            if (queen_columns[j] == current_column) {
                is_valid = false;
                break;
            }
            // Check for diagonal conflict with previous rows
            if (Math.abs(queen_columns[j] - current_column) == Math.abs(current_row - j)) {
                is_valid = false;
                break;
            }
        }
        return is_valid;
    }

    void appendToAnswerString(int[] queen_columns, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (queen_columns[j] == i) answer += '1';
                else answer += '0';
            }
            answer += '\n';
        }
        answer += '\n';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =  scanner.nextInt();
        scanner.close();
        NQueens result = new NQueens();
        String board = result.nQueens(n);
        System.out.println(board);
    }
}