class Solution {
    public int[][] generateMatrix(int n) {
        int r = 0; // row
        int c = 0; // column
        int mr = n; // maximum rouw
        int mc = n; // maximum column
        int gen = 1;
        int mtx[][] = new int[n][n];
        while(gen <= n*n)
        {
            // Top wall
            for(int i = c; i < mc; i++)
            {
                mtx[r][i] = gen;
                gen++;
            }
            r++;
            // Right wall
            for( int i = r; i < mr; i++)
            {
                mtx[i][mc-1] = gen;
                gen++;
            }
            mc--;
            // Bottom wall
            for(int i = mc-1; i >= c; i--)
            {
                mtx[mr-1][i] = gen;
                gen++;
            }
            mr--;
            // Left wall
            for(int i = mr-1; i >= r; i--)
            {
                mtx[i][c] = gen;
                gen++;
            }
            c++;
        }
    return mtx;
    }
}
