
class Solution {
    public int[] matrixDiagonally(int[][] mat) {
        int r = mat.length;
        int arr[] = new int[r*r];
        int idx = 0;
        int p = 1;
        int i = 0;
        int j = 0;
        while(idx<r*(r+1)/2)
        {
            if(p == 1)
            {
                arr[idx++] = mat[i][j];
                if(i == 0)
                {
                    j++;
                    p =0;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                arr[idx++] = mat[i][j];
                if(j ==0)
                {
                    i++;
                    p = 1;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }
        if(p == 0)
        {
            i +=1;
            j = r-1;
        }
        else
        {
            i = r-1;
            j += 1;
        }
        while(idx<r*r)
        {
            if(p == 1)
            {
                arr[idx++] = mat[i][j];
                if(j == r-1)
                {
                    i++;
                    p = 0;
                }
                else
                {
                    i--;
                    j++;
                }
            }
            else
            {
                arr[idx++] = mat[i][j];
                if(i == r-1)
                {
                    j++;
                    p = 1;
                }
                else
                {
                    i++;
                    j--;
                }
            }
        }
        return arr;
    }
}
