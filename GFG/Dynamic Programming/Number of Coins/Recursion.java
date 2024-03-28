
class Solution{

	public int minCoins(int coins[], int M, int sum) 
	{ 
	    return recursion(coins, 0, sum);
	}
	public int recursion(int coins[], int step, int sum)
    {
        if(sum<0)
            return Integer.MAX_VALUE;
        if(sum == 0)
            return step;
        int min = Integer.MAX_VALUE;
        for(int i: coins)
        {
            min = Math.min(recursion(coins, step+1, sum-i), min);
        }
        return min;
    }
}
