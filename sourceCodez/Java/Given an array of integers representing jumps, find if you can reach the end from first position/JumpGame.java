import java.util.Scanner;

class JumpGame {
    
    public String canJump(int[] nums) {

        int last_position = nums.length - 1;

        for (int i = nums.length - 1; i >= 0; i--) {

            if (i + nums[i] >= last_position) {
                last_position = i;
            }
        }

        if (last_position == 0) 
            return "true";

        return "false";
    }

    public static void main(String args[]) {
        
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int nums[] = new int[n];

        for(int i = 0 ; i < n ;i++) {
            nums[i] = scanner.nextInt();
        }

        String result = new JumpGame().canJump(nums);

        System.out.println(result);


    }
}
