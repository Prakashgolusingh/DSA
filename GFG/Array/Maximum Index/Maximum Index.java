class Solution{
    
    // A[]: input array
    // N: size of array
    // Function to find the maximum index difference.
    static int maxIndexDiff(int a[], int n) { 
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            int j = n-1;
            if(j-i<ans)
                return ans;
            while(j-i>ans)
            {
                if(a[i]<= a[j])
                    ans = Math.max(ans, j-i);
                j--;    
            }
        }
        return ans;
    }
}
