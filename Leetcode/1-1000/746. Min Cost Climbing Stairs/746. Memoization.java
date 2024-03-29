class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length+1];
        return recursion(cost, 0, dp);
    }
    public int recursion(int cost[], int i, int dp[])
    {
        int n = cost.length;
        if(i==n-1)
            return 0;
        if(dp[i] != 0)
            return dp[i];
        if(i ==n-2)
            return dp[i] = Math.min(cost[i], cost[i+1]);
        return dp[i] = Math.min(cost[i]+recursion(cost, i+1, dp), cost[i+1]+recursion(cost, i+2, dp));
    }
}
