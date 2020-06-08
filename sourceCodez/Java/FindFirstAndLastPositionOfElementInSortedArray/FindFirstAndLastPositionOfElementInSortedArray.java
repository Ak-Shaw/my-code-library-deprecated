import java.util.Scanner;


class FindFirstAndLastPositionOfElementInSortedArray {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for(int i = 0 ; i < n ; i++) {
            nums[i] = scanner.nextInt();
        }
        int Q = scanner.nextInt();
        for(int i = 0 ; i < Q ; i++) {
        int target = scanner.nextInt();
        int result[] = new int[2];
        result = new Solution().searchRange(nums , target);
        System.out.println(result[0] + " " + result[1]);
        }
    }
}