class Solution {
    public int tribonacci(int n) {
            int dp[]=new int[n+1];
            return(tb(n,dp));
        
    }
        public int tb(int n,int dp[])
        {
                if(n<0)
                        return 0;
                if(n==0||n==1)
                        dp[n]=n;
                if(n==2)
                        dp[2]=1;
                if(dp[n]!=0)
                        return dp[n];
                else
                                dp[n]=  tb(n-1,dp)+tb(n-2,dp)+tb(n-3,dp);
                return dp[n];
        }
}
