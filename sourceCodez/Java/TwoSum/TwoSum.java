import java.io.*;
import java.util.*;

public class TwoSum {
    // Implement your solution by completing the below function	
    public int[] twoSum(int[] nums, int target) {

        int[] result=new int[2];

        int l=nums.length;

        int x=0;
        int c=0;

        while(x<=l-2){
            c=1;
            while(c<l-x){

                if(nums[x]+nums[x+c]==target){

                    result[0]=x;
                    result[1]=x+c;

                    return result;
                }

                c++;
            }

            x++;

        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[scanner.nextInt()];
        for (int i = 0; i < numbers.length; i++)
            numbers[i] = scanner.nextInt();
        int target = scanner.nextInt();
        scanner.close();

        int[] complements = new TwoSum().twoSum(numbers, target);
        System.out.print(complements[0] + " " + complements[1]);
    }
}
