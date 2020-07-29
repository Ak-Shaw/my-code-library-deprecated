import java.util.*;

class TripleStep {
    
    int numberOfWays(int n) {
        
        if (n == 1 || n == 2) {

            return n;
        }

        int mod = 1000000007;

        int first = 1;
        int second = 1;
        int third = 2;
        int current;

        for (int i = 2; i < n; i++) {

            current = ((first % mod + second % mod) % mod + third % mod) % mod;

            first = second;

            second = third;

            third = current;
        }

        return third;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        TripleStep tripleStep = new TripleStep();
        int result = tripleStep.numberOfWays(n);
        System.out.println(result);
        scanner.close();
    }
}
