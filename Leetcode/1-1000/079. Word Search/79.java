class Solution {
    public boolean exist(char[][] board, String word) {
        boolean ans = false;
        for(int i=0; i<board.length; i++)
        {
            for(int j=0; j<board[0].length; j++)
            {
                if(board[i][j] == word.charAt(0))
                {
                    boolean vis[][] = new boolean[board.length][board[0].length];
                    ans = ans || recursion(board, word, vis, i, j, 1);
                    if(ans)
                        return ans;
                }
            }
        }
        return ans;
    }
    public boolean recursion(char[][] board, String word, boolean vis[][], int i, int j, int step)
    {
        vis[i][j] = true;
        if(step == word.length())
            return true;
        boolean ans = false;
        int n = board.length, m = board[0].length;
        if((i-1>=0 && !vis[i-1][j]) && (board[i-1][j] == word.charAt(step)))
            ans = ans || recursion(board, word, vis, i-1, j, step+1);
        if((i+1<n && !vis[i+1][j]) && (board[i+1][j] == word.charAt(step)))
            ans = ans || recursion(board, word, vis, i+1, j, step+1);
        if((j-1>=0 && !vis[i][j-1]) && (board[i][j-1] == word.charAt(step)))
            ans = ans || recursion(board, word, vis, i, j-1, step+1);
        if((j+1<m && !vis[i][j+1]) && (board[i][j+1] == word.charAt(step)))
            ans = ans || recursion(board, word, vis, i, j+1, step+1);
        vis[i][j] = false;
        return ans;
    }
}
