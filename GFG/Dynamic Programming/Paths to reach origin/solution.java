

class Solution
{
    public static int ways(int n, int m)
    {
        if(m == 0 || n == 0)
            return 1;
        int mod = 1000_000_007;
        int arr[][] = new int[n+1][m+1];
        for(int i=0; i<=n; i++)
            arr[i][0] = 1;
        for(int i=0; i<=m; i++)
            arr[0][i] = 1;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
                arr[i][j] = (arr[i-1][j]+arr[i][j-1])%mod;
        }
        return arr[n][m];
    }
}
