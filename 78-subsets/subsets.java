class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempres = new ArrayList<>();

        sub(0, nums.length, nums, tempres, res);
        return res;
    }

    public void sub(int i, int n, int[] arr, List<Integer> tempres, List<List<Integer>> res) {
        if(i == n) {
            res.add(new ArrayList<>(tempres));
            return;
        }
        tempres.add(arr[i]);
        sub(i+1, n, arr, tempres, res);

        tempres.remove(tempres.size() - 1);
        sub(i+1, n, arr, tempres, res);

    }
}