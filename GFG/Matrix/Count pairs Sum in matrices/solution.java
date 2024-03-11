class Solution {
    int countPairs(int mat1[][], int mat2[][], int n, int x) {
        int r = 0;
        int l = n*n-1;
        int count = 0;
        while(r<n*n && l>=0)
        {
            int i1 = r/n;
            int j1 = r%n;
            int i2 = l/n;
            int j2 = l%n;
            if(mat1[i1][j1]+mat2[i2][j2]<x)
                r++;
            else if(mat1[i1][j1]+mat2[i2][j2]>x)
                l--;
            else
            {
                count++;
                r++;
            }
        }
        return count;
    }
}
