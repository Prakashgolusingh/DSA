class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][] = new int[m][n];
        return recursion(m, n, 0, 0, dp);
    }
    public int recursion(int m, int n, int i, int j, int dp[][])
    {
        if(i<0 || i>m-1)
            return 0;
        if(j<0 || j>n-1)
            return 0;
        if(dp[i][j] != 0)
            return dp[i][j];
        if(i == m-1 && j == n-1)
            return 1;
        return dp[i][j] = recursion(m, n, i+1, j, dp)+recursion(m, n, i, j+1, dp);
    }
}
