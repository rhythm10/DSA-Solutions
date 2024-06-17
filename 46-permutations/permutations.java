class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> tempans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        per(nums.length, nums, freq, tempans, ans);
        return ans;
    }

    public void per(int n, int[] arr, boolean[] freq, 
        List<Integer> tempans, List<List<Integer>> ans) {

        if(tempans.size() == n) {
            ans.add(new ArrayList<>(tempans));
            return;
        }

        for(int i = 0 ; i < n; i++) {
            if(!freq[i]) {
                freq[i] = true;
                tempans.add(arr[i]);
                per(n, arr, freq, tempans, ans);
                tempans.remove(tempans.size()-1);
                freq[i] = false;
            }
        }
    }
}