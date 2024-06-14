class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempRes = new ArrayList<>();
        getcomb(0, candidates.length, target, candidates, res, tempRes);
        return res;
    }

    public void getcomb(int i, int n,int target, int[] arr, List<List<Integer>> res, List<Integer> tempRes) {
        if(i == n) {
            if(target == 0) {
                res.add(new ArrayList<>(tempRes));
            }
            return;
        }

        if(arr[i] <= target) {
            tempRes.add(arr[i]);
            getcomb(i, n, target - arr[i], arr, res, tempRes);
            tempRes.remove(tempRes.size() - 1);
        }
        getcomb(i+1, n, target, arr, res, tempRes);
    
    }
}