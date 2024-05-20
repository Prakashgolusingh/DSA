class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();
        int dp[][] = new int[2][length2+1];
        for(int i=0; i<length1; i++)
        {
            for(int j=1; j<=length2; j++)
            {
                if(text1.charAt(i) == text2.charAt(j-1))
                    dp[1][j] = 1+dp[0][j-1];
                else
                    dp[1][j] = Math.max(dp[0][j], dp[1][j-1]);
            }
            for(int j=1; j<=length2; j++)
                dp[0][j] = dp[1][j];
        }
        return dp[1][length2];
    }
}
