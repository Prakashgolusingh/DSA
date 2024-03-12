class Solution {
    static long genFibNum(Long a, Long b, Long c, long n, long m) {
        long M[][] = {{a, b, c},{1, 0, 0},{0, 0, 1}};
        if(n<3)
            return 1;
        long x[][] = expo(M, n-2,m);
        long g[][] = {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}};
        long ans[][] = multiply(x, g, m);
        return ans[0][0]%m;
    }
    static long[][] multiply(long x[][], long g[][], long m)
    {
        long ans[][] = new long[3][3];
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                for(int k=0; k<3; k++)
                    ans[i][j] += x[i][k]*g[k][j];
                ans[i][j] %=m;
            }
        }
        return ans;
    }
    static long[][] expo(long mat[][], long n,long m)
    {
        if(n == 0)
        {
            long x1[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
            return x1;
        }
        if(n == 1)
            return mat;
        long x[][] = expo(mat, n/2, m);
        if(n%2 == 0)
            return multiply(x, x, m);
        else
            return multiply(multiply(x, x, m), mat, m);
    }
    
};
