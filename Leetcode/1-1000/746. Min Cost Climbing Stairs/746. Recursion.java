class Solution {
    public int minCostClimbingStairs(int[] cost) {
        return recursion(cost, 0);
    }
    public int recursion(int cost[], int i)
    {
        int n = cost.length;
        if(i==n-1)
            return 0;
        if(i ==n-2)
            return Math.min(cost[i], cost[i+1]);
        return Math.min(cost[i]+recursion(cost, i+1), cost[i+1]+recursion(cost, i+2));
    }
}
