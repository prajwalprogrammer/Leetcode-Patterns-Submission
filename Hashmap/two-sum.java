class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> M = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int diff = target - nums[i];
            if(M.containsKey(diff)){
                return new int[]{M.get(diff), i};
            }
            M.put(nums[i], i);
        }
        return new int[]{};
    }
}