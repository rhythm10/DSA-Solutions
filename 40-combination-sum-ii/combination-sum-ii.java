class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempRes = new ArrayList<>();
        Arrays.sort(candidates);
        getcomb(0, candidates.length, target, candidates, res, tempRes);
        return res;
    }

    public void getcomb(int i, int n,int target, int[] arr, List<List<Integer>> res, List<Integer> tempRes) {
        if(target == 0) {
            res.add(new ArrayList<>(tempRes));
            return;
        }

        for (int ind = i ; ind < arr.length; ind++) {
            if(ind > i && arr[ind] == arr[ind-1]) continue;
            if(arr[ind] > target) break;
            if(arr[ind] <= target) {
                tempRes.add(arr[ind]);
                getcomb(ind+1, n, target - arr[ind], arr, res, tempRes);
                tempRes.remove(tempRes.size() - 1);
            }
        }
    }
}

