// Memoization
class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        return Math.max(recursion(nums, nums.length-1, dp), recursion(nums, nums.length-2, dp));
    }
    public int recursion(int nums[], int idx, int dp[])
    {
        if(idx<0)
            return 0;
        if(dp[idx] != 0)
            return dp[idx];
        int include = nums[idx]+ recursion(nums, idx-2, dp);
        int exclude = recursion(nums, idx-1, dp);
        return dp[idx] = Math.max(include, exclude);
    }
