class Solution {
    public int findMiddleIndex(int[] nums) {
        if(nums.length < 1) {
            return -1;
        }

        int[] pref = new int[nums.length];
        pref[0] = nums[0];

        for(int i=1;i<nums.length;i++){
            pref[i] = nums[i] + pref[i-1];
        }

        for(int i=0;i<pref.length;i++) {
            if(i==0) {
                if((pref[pref.length-1] - pref[0]) == 0) {
                    return i;
                }
                continue;
            }
            if(i == pref.length-1) {
                if(pref[pref.length-2] == 0) {
                    return i;
                }
                continue;
            }
            int leftSum = pref[i-1];
            int rightSum = pref[pref.length-1] - pref[i];

            if(leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }
}