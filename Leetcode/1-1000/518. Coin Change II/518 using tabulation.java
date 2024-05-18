class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[amount+1][n+1];
        dp[0][0] = 1;
        for(int i=0; i<=amount; i++)
        {
            for(int j=1; j<=n; j++)
            {
                int take = 0;
                if(i>=coins[j-1])
                    take = dp[i-coins[j-1]][j];
                int not_take = dp[i][j-1];
                dp[i][j] = take+not_take;
            }
        }
        return dp[amount][n];
    }
}
