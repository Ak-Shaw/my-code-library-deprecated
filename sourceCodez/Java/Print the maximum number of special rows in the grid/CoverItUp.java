import java.util.*;


class CoverItUp {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i = 0 ; i < t ; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();
            int grid[][] = new int[n][m];
            for(int p = 0 ; p < n ; p++) {
                for(int j = 0 ; j < m ; j++) {
                    grid[p][j] = scanner.nextInt();
                }
            }
            int result = coveritUp(grid, k);
            System.out.println(result);
        }
    }

    static int coveritUp(int grid[][],int k) {

        int specialRows = 0;
        boolean sheetNotUsed = true;

        for (int i = 0; i < grid.length; i++) {

            if (countOfOnes(grid[i]) == grid[i].length) {
                specialRows++;

            } else if (sheetNotUsed) {

                if (sheetCanBeUsed(grid[i], k)) {
                    sheetNotUsed = false;
                    specialRows++;
                }
            }
        }

        return specialRows;
    }

    static int countOfOnes(int[] a) {

        int count = 0;

        for (int i = 0; i < a.length; i++) {
            count += a[i];
        }

        return count;
    }

    static boolean sheetCanBeUsed(int[] a, int k) {

        int indexOfFirstZero = getIndexOfFirstZero(a);
        int indexOfLastZero = getIndexOfLastZero(a);

        if (indexOfLastZero - indexOfFirstZero < k) {
            return true;
        }

        return false;
    }

    static int getIndexOfFirstZero(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                return i;
            }
        }

        return -1;
    }

    static int getIndexOfLastZero(int[] a) {

        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == 0) {
                return i;
            }
        }

        return -1;
    }
}
