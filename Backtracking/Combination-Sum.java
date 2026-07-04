class Solution {
    int[] nums;
    int size;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.nums = candidates;
        size = candidates.length;
        List<Integer> ansLevel=new ArrayList<>();;
        List<List<Integer>> ans=new ArrayList<>();;
        solve(0,ans, ansLevel, target);
        return ans;

    }
    private void solve(int idx, List<List<Integer>> ans, List<Integer> ansLevel, int target){
        if(target == 0){
            ans.add(new ArrayList<>(ansLevel));
            return;
        }
        if(idx == size){
            return;
        }

        if(nums[idx] <= target){
            ansLevel.add(nums[idx]);
            solve(idx,ans,ansLevel,target - nums[idx]);
            ansLevel.remove(ansLevel.size() - 1);
        }
        solve(idx+1,ans, ansLevel,target);
    }
}
