class Solution {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        boolean vis[][] = new boolean[row][col];
        int ans = 0;
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                if(grid[i][j] == '1' && !vis[i][j])
                {
                    ans++;
                    dfs(grid, vis, i, j, row, col);
                }
            }
        }
        return ans;
    }
    public void dfs(char grid[][], boolean vis[][], int i, int j, int row, int col)
    {
        vis[i][j] = true;
        if(i-1>=0)
        {
            if(grid[i-1][j] == '1' && !vis[i-1][j])
                dfs(grid, vis, i-1, j, row, col);
        }
        if(i+1<row)
        {
            if(grid[i+1][j] == '1' && !vis[i+1][j])
                dfs(grid, vis, i+1, j, row, col);
        }
        if(j-1>=0)
        {
            if(grid[i][j-1] == '1' && !vis[i][j-1])
                dfs(grid, vis, i, j-1, row, col);
        }
        if(j+1<col)
        {
            if(grid[i][j+1] == '1' && !vis[i][j+1])
                dfs(grid, vis, i, j+1, row, col);
        }
        
    }
}
