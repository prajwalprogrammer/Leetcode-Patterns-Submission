// https://leetcode.com/problems/maximum-sum-circular-subarray/solutions/178422/one-pass-by-lee215-navi/
class Solution {
    private int minSub(int[] nums){
        int minSum = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            sum = Math.min(sum+nums[i],nums[i]);
            minSum = Math.min(sum, minSum);
        }
        return minSum;
    }
    private int maxSub(int[] nums){
        int maxSum = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            sum = Math.max(sum+nums[i], nums[i]);
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = maxSub(nums);
        int minSum = minSub(nums);

        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }
        System.out.println(maxSum + "  " + minSum);
        int CirSum = totalSum - minSum;
        return maxSum > 0 ? Math.max(CirSum, maxSum) : maxSum;
    }
}