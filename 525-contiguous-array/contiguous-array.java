class Solution {
    public int findMaxLength(int[] nums) {
        return optimal(nums);
        // return brute(nums);
    }

    public int optimal(int[] nums) {
        int n = nums.length - 1;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int maxi = 0, sum =0;

        for(int i=0;i<=n;i++) {
            sum += (nums[i] == 0) ? -1 : 1;
            
            if (sum == 0) {
                maxi = Math.max(maxi, i + 1); // Update maxi if sum is zero from index 0
            }

            if (hm.containsKey(sum)) {
                maxi = Math.max(maxi, i - hm.get(sum)); // Length of subarray
            } else {
                hm.put(sum, i); // Store the index of the first occurrence of this sum
            }
        }

        return maxi;
    }

    public int brute(int[] nums) {
        int n = nums.length;
        int maxi = 0;
        for(int i=0;i<n-1;i++) {
            int sum = nums[i] == 0 ? -1 : 1;
            for(int j=i+1;j<n;j++) {
                if(nums[j] == 0) {
                    sum += -1;
                } else {
                    sum += 1;
                }
                if(sum == 0) {
                    maxi = Math.max(maxi, j - i + 1);
                }
            }
        }
        return maxi;
    }
}