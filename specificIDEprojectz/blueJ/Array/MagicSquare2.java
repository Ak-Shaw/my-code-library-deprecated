/*************************************************************************
 *  Compilation:  javac MagicSquare.java
 *  Execution:    java MagicSquare N
 *
 *  Generates a magic square of order N. A magic squares is an N-by-N
 *  matrix of the integers 1 to N^2, such that all row, column, and
 *  diagonal sums are equal.
 *
 *  One way to generate a magic square when N is odd is to assign
 *  the integers 1 to N^2 in ascending order, starting at the
 *  bottom, middle cell. Repeatedly assign the next integer to the
 *  cell adjacent diagonally to the right and down. If this cell
 *  has already been assigned another integer, instead use the
 *  cell adjacently above. Use wrap-around to handle border cases.
 *
 * 
 *  % java MagicSquare 3
 *   4  9  2 
 *   3  5  7 
 *   8  1  6 
 *
 *  % java MagicSquare 5
 *  11 18 25  2  9 
 *  10 12 19 21  3 
 *   4  6 13 20 22 
 *  23  5  7 14 16 
 *  17 24  1  8 15 
 *
 *  Limitations
 *  -----------
 *   - N must be odd
 *
 *************************************************************************/

public class MagicSquare2 {

    public static void main(String[] args) { 
        int N = Integer.parseInt(args[0]);
        if (N % 2 == 0) throw new RuntimeException("N must be odd");

        int[][] magic = new int[N][N];

        int row = N-1;
        int col = N/2;
        magic[row][col] = 1;

        for (int i = 2; i <= N*N; i++) {
            if (magic[(row + 1) % N][(col + 1) % N] == 0) {
                row = (row + 1) % N;
                col = (col + 1) % N;
            }
            else {
                row = (row - 1 + N) % N;
                // don't change col
            }
            magic[row][col] = i;
        }

        // print results
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (magic[i][j] < 10)  System.out.print(" ");  // for alignment
                if (magic[i][j] < 100) System.out.print(" ");  // for alignment
                System.out.print(magic[i][j] + " ");
            }
            System.out.println();
        }

    }
}
