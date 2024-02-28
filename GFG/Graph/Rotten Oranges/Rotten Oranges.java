class Solution
{
    //Function to find minimum time required to rot all oranges. 
    public int orangesRotting(int[][] grid)
    {
        int time[][] = new int[grid.length][grid[0].length];
        for(int i=0; i<grid.length; i++)
        {
            for(int j=0; j<grid[0].length; j++)
            {
                if(grid[i][j] == 2)
                {
                    dfs(grid, time, i, j, 0);
                }
            }
        }
        int max= 0;
        {
            for(int i=0; i<grid.length; i++)
            {
                for(int j=0; j<grid[0].length; j++)
                {
                    if(grid[i][j]==1)
                    {
                        if(time[i][j] ==0)
                            return -1;
                        else
                        {
                            if(time[i][j]>max)
                                max = time[i][j];
                        }
                    }
                }
            }
        }
        
        return max;
    }
    public void dfs(int [][] grid, int time[][],int i, int j, int step)
    {
        if(time[i][j] == 0)
            time[i][j] = step;
        else if(time[i][j]>step)
            time[i][j] = step;
        if(i-1>=0)
        {
            if((time[i-1][j]>step || time[i-1][j] == 0) && grid[i-1][j] == 1)
                dfs(grid, time, i-1, j, step+1);
        }
        if(i+1<grid.length)
        {
            if((time[i+1][j]>step || time[i+1][j] == 0) && grid[i+1][j] == 1)
                dfs(grid, time, i+1, j, step+1);
        }
        if(j-1>=0)
        {
            if((time[i][j-1]>step || time[i][j-1] == 0) && grid[i][j-1] == 1)
                dfs(grid, time, i, j-1, step+1);
        }
        if(j+1<grid[0].length)
        {
            if((time[i][j+1]>step || time[i][j+1]==0) && grid[i][j+1] == 1)
                dfs(grid, time, i, j+1, step+1);
        }
    }
}

