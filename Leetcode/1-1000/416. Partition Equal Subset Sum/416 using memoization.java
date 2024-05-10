class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i: nums)
            sum += i;
        if(sum%2 != 0)
            return false;
        int target = sum/2;
        int n = nums.length;
        byte dp[][] = new byte[target+1][n];
        byte ans = recursion(nums, n-1, target, dp);
        if(ans == 1)
            return false;
        return true;
    }
    byte recursion(int arr[], int step, int target, byte dp[][])
    {
        if(target == 0)
            return 2;
        else if(step<0 || target<0)
            return 1;
        if(dp[target][step] != 0)
            return dp[target][step];
        byte exclude = recursion(arr, step-1, target, dp);
        if(exclude == 2)
            return dp[target][step] = 2;
        byte include = recursion(arr, step-1, target-arr[step], dp);
            return dp[target][step] = include;
    }
}
