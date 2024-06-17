class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> tempres = new ArrayList<>();
        Arrays.sort(nums);
        sub(0, nums.length, nums, tempres, res);
        List<List<Integer>> t = new ArrayList<>(res);
        return t;
    }


    public void sub(int i,int n,int[] arr,List<Integer> tempres,Set<List<Integer>> res) {
        if(i == n) {
            res.add(new ArrayList<Integer>(tempres));
            return;
        }
        tempres.add(arr[i]);
        sub(i+1, n, arr,  tempres, res);

        tempres.remove(tempres.size() -1);
        sub(i+1, n, arr,  tempres, res);
    }
}