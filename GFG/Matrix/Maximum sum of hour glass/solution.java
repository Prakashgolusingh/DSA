
class Solution {
    int findMaxSum(int n, int m, int mat[][]) {
        if(m<3 || n<3)
            return -1;
        int max_sum = 0;
        for(int k=2; k<n; k++)
        {
            int cur = 0;
            for(int i=k-2; i<=k; i++)
            {
                for(int j=0; j<3; j++)
                {
                    cur += mat[i][j];
                }
            }
            cur = cur - mat[k-1][0] - mat[k-1][2];
            if(cur>max_sum)
                max_sum = cur;
            for(int i=3; i<m; i++)
            {
                cur = cur - mat[k-2][i-3] - mat[k][i-3] -mat[k-1][i-2]+ mat[k-1][i-1] + mat[k-2][i]+ mat[k][i];
                if(cur>max_sum)
                    max_sum = cur;
            }
        }
        return max_sum;
    }
};
