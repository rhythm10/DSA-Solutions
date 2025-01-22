class Solution {
    public int maxProduct(int[] nums) {
        int curr = 1, max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++) {
            curr *= nums[i];
            if(max < curr) {
                max = curr;
            } 
            if(curr == 0) {
                curr = 1;
            }
        }

        curr = 1;
        for(int i=nums.length-1;i>=0;i--) {
            curr *= nums[i];
            if(max < curr) {
                max = curr;
            } 
            if(curr == 0) {
                curr = 1;
            }
        }

        return max;

    }
}