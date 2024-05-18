class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;
        return recursion(coins, amount, n-1);
    }
    public int recursion(int coins[], int amount, int step)
    {
        if(amount<0 || step<0)
            return 0;
        if(amount == 0)
            return 1;
        int take = recursion(coins, amount-coins[step], step);
        int not_take = recursion(coins, amount, step-1);
        return (take + not_take);
    }
}
