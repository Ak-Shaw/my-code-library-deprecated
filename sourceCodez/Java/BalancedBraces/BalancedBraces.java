import java.util.*;

public class BalancedBraces {

    ArrayList<String> balancedBraces(int n) {
        
        ArrayList<String> ans = new ArrayList<>();

        backtrack("", 0, 0, n, ans);

        return ans;
    }

    void backtrack(String s, int left, int right, int n, ArrayList<String> ans) {

        if (s.length() == 2 * n) {

            ans.add(s);
            return;
        }

        if (left < n) {

            backtrack(s + '(', left + 1, right, n, ans);
        }

        if (right < left) {

            backtrack(s + ')', left, right + 1, n, ans);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<String> answer = new BalancedBraces().balancedBraces(n);
        for(int i = 0 ; i < answer.size() ; i++) {
            System.out.println(answer.get(i));
        }
    }
}
