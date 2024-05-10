class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i: nums)
            sum += i;
        if(sum%2 != 0)
            return false;
        int target = sum/2;
        int n = nums.length;
        boolean dp[][] = new boolean[target+1][n+1];
        dp[0][0] = true;
        for(int i=0; i<=target; i++)
        {
            for(int j=1; j<=n; j++)
            {
                if(i-nums[j-1]>=0)
                    dp[i][j] = dp[i-nums[j-1]][j-1];
                dp[i][j] = dp[i][j] || dp[i][j-1];
            }
        }
        return dp[target][n];
    }
}
