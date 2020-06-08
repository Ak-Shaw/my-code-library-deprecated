import java.util.*;

class Tribonacci {
    int tribonacci(int n) {

        if (n == 0) {

            return 0;
        }

        if (n == 1) {

            return 1;
        }

        if (n == 2) {

            return 1;
        }

        return tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = new Tribonacci().tribonacci(n);
        System.out.println(result);
    }
}
