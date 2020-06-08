import java.io.*;
import java.util.*;

public class WordSearch {

    public boolean exist(char[][] board, String word) {
        
        int num_rows = board.length;
        int num_columns = board[0].length;

        // Start the search with every letter on the board
        for (int row = 0; row < num_rows; row++) {
            for (int col = 0; col < num_columns; col++) {
                if (findWord(board, num_rows, num_columns, row, col, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean findWord(char[][] board, int num_rows, int num_columns, 
                int row, int col, String word, int index) {

        if (index >= word.length()) // Successfil termination condition
            return true;

        // Failure condition - mismatch or out of bounds
        if (row < 0 || row == num_rows || 
                col < 0 || col == num_columns || board[row][col] != word.charAt(index))
            return false;
        
        boolean found = false;
        board[row][col] = '#'; // Mark position as visited

        int[] rowChangeForNextDir = {0, 1, 0, -1};
        int[] colChangeForNextDir = {1, 0, -1, 0};
        for (int dir = 0; dir < 4; dir++) {
            found = findWord(board, num_rows, num_columns, 
                    row + rowChangeForNextDir[dir], 
                    col + colChangeForNextDir[dir], word, index + 1);

            if (found) // Success
                break;
        }

        // Optionally, restore the letter before returning
        board[row][col] = word.charAt(index);
        return found;
    }   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        char board[][] = new char [row][col];
        for(int i = 0 ; i < row ; i++) {
            for(int j = 0 ; j < col;  j++) {
                board[i][j] = scanner.next().charAt(0);
            }
        }
        String word = scanner.next();
        scanner.close();
        boolean result = new WordSearch().exist(board , word);
        System.out.println(result);
    }
}
