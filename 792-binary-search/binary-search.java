class Solution {
    public int search(int[] nums, int target) {
        return find(0, nums.length - 1, nums, target);
    }

    public int find(int i, int j, int[] nums, int target) {
        if( i > j) {
            return -1;
        }
         int mid = (i + j) / 2;
        if(nums[mid] == target) {
            return mid;
        }
        if(nums[mid] < target) {
            return find(mid+1, j, nums, target);
        } else {
            return find(i, mid-1, nums, target);
        }

        // return -1;

    }
}