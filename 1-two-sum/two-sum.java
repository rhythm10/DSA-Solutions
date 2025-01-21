class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] res = new int[2];

        hm.put(nums[0],0);

        for(int i=1;i<nums.length;i++) {
            int rem = target - nums[i];
            if(hm.containsKey(rem)) {
                res[0] = hm.get(rem);
                res[1] = i;
                break;
            } else {
                hm.put(nums[i], i);
            }
        }

        return res;
    }
}