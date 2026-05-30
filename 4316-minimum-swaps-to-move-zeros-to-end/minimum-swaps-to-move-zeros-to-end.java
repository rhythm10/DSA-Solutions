class Solution {
    public int minimumSwaps(int[] nums) {
        int count0 = 0, countNum = 0;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] == 0) {
                count0++;
            }
        }
        if(count0 == 0){
            return 0;
        }

        for(int i=nums.length-1;i>=(nums.length - count0);i--) {
            if(nums[i] == 0) {
                countNum++;
            }
        }

        return count0 - countNum;
    }
}