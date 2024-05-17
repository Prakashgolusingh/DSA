class Solution {
    public int coinChange(int[] coins, int amount) {
        int ans = recursion(coins, amount, coins.length-1);
        if(ans>amount)
            return -1;
        return ans;
    }
    public int recursion(int coins[], int amount, int step)
    {
        if(step<0 || amount<0)
            return 10000;
        if(amount == 0)
            return 0;
        int take = 1+ recursion(coins, amount-coins[step], step);
        int not_take = recursion(coins, amount, step-1);
        return Math.min(take, not_take);
    }
}
