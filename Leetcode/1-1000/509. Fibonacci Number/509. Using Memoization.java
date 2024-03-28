class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        return recursion(n, dp);
    }
    public int recursion(int n, int dp[])
    {
        if(n <2)
            return dp[n] = n;
        if(dp[n] != 0)
            return dp[n];
        return dp[n]= recursion(n-1, dp)+recursion(n-2, dp);
    }
}
