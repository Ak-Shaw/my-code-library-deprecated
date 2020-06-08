class Solution {
    public int maxProduct(int[] nums) {
        
        int x = 0, c = 0, l = nums.length, max = 0;
        
        while(x<=l-2){
            c=1;
            while(c<l-x){

                int currentProd = (nums[x] - 1) * (nums[x + c] - 1);
                
                max = Math.max(max, currentProd);

                c++;
            }

            x++;

        }
        
        return max;

    }
}