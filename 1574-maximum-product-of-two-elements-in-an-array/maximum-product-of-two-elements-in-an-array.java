class Solution {
    public int maxProduct(int[] nums) {
        int largest = -1;
        int secondlargest = -1;

        for(int i=0;i<nums.length;i++)
        {
            if(largest <= nums[i] && nums[i] >= secondlargest)
            {
                secondlargest = largest;
                largest = nums[i];
            }
            if(nums[i] < largest && nums[i] >= secondlargest)
            {
                secondlargest = nums[i];
            }
        }

        return ((largest - 1 ) * ( secondlargest -1));
    }
}