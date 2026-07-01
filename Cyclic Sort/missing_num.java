class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int curr = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[curr]){
                int temp = nums[i];
                nums[i] = nums[curr];
                nums[curr] = temp;
            }else{
                i++;
            }
        }
        for(int idx = 0;idx<nums.length;idx++){
            if(idx != nums[idx]){
                return idx;
            }
        }
        return nums.length;
    }
}
