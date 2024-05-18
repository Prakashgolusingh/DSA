class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        int dp[][] = new int[amount+1][n+1];
        return recursion(coins, amount, n-1, dp);
    }
    public int recursion(int coins[], int amount, int step, int dp[][])
    {
        if(amount<0 || step<0)
            return 0;
        if(amount == 0)
            return 1;
        if(dp[amount][step] != 0)
            return dp[amount][step];
        int take = recursion(coins, amount-coins[step], step, dp);
        int not_take = recursion(coins, amount, step-1, dp);
        return dp[amount][step] = (take + not_take); 
    }
}
