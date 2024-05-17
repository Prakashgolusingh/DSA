class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[amount+1][n+1];
        for(int i=1; i<=amount; i++)
            dp[i][0] = amount+1;
        for(int i=1; i<=amount; i++)
        {
            for(int j=1; j<=n; j++)
            {
                int take = amount+1;
                if(i>=coins[j-1])
                    take = 1+dp[i-coins[j-1]][j];
                int not_take = dp[i][j-1];
                dp[i][j] = Math.min(take, not_take);
            }
        }
        if(dp[amount][n]>amount)
            return -1;
        return dp[amount][n];
    }
}
