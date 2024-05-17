class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[amount+1][2];
        for(int i=1; i<=amount; i++)
            dp[i][0] = amount+1;
        for(int i=1; i<=amount; i++)
        {
            for(int j=0; j<n; j++)
            {
                int take = amount+1;
                if(i>=coins[j])
                    take = 1+dp[i-coins[j]][1];
                int not_take = dp[i][0];
                dp[i][1] = Math.min(take, not_take);
                dp[i][0] = dp[i][1];
            }
        }
        if(dp[amount][1]>amount)
            return -1;
        return dp[amount][1];
    }
}
