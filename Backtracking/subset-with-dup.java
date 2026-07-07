class Solution {
    private void solve(int idx, int[] nums, List<Integer> res, List<List<Integer>> ans){
        if(idx == nums.length){
            ans.add(new ArrayList<>(res));
            return;
        }

        res.add(nums[idx]);
        solve(idx + 1, nums, res, ans);
        res.remove(res.size() - 1);
        while(idx + 1 < nums.length && nums[idx] == nums[idx+1]){
            idx++;
        }
        solve(idx + 1, nums, res, ans);
    } 
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> res = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        solve(0, nums, res, ans);
        return ans;
    }
}
