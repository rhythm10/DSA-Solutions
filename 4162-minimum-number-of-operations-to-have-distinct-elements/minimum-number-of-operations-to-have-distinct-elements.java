class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        int duplicateCount = 0;
        for (int count : hm.values()) {
            if (count > 1) duplicateCount++;
        }
        
        int operations = 0;
        int start = 0;
        int n = nums.length;
        
        // Process until no duplicates or array is empty
        while (start < n && duplicateCount > 0) {
            operations++;
            
            // Remove first 3 elements (or remaining)
            for (int i = 0; i < 3 && start < n; i++) {
                int val = nums[start++];
                int count = hm.get(val);
                
                if (count == 2) {
                    duplicateCount--; // duplicate resolved
                }
                
                hm.put(val, count - 1);
            }
        }
        
        return operations;
    

         
    }
}