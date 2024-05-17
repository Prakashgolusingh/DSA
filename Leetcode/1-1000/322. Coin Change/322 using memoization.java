class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][] = new int[amount+1][coins.length];
        int ans = recursion(coins, amount, coins.length-1, dp);
        if(ans>amount)
            return -1;
        return ans;
    }
    public int recursion(int coins[], int amount, int step, int dp[][])
    {
        if(step<0 || amount<0)
            return 10000;
        if(amount == 0)
            return 0;
        if(dp[amount][step] != 0)
            return dp[amount][step];
        int take = 1+ recursion(coins, amount-coins[step], step, dp);
        int not_take = recursion(coins, amount, step-1, dp);
        return dp[amount][step] = Math.min(take, not_take);
    }
}
