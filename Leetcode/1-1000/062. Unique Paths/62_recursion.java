class Solution {
    public int uniquePaths(int m, int n) {
        return recursion(m, n, 0, 0);
    }
    public int recursion(int m, int n, int i, int j)
    {
        if(i<0 || i>m-1)
            return 0;
        if(j<0 || j>n-1)
            return 0;
        if(i == m-1 && j == n-1)
            return 1;
        return recursion(m, n, i+1, j)+recursion(m, n, i, j+1);
    }
}
