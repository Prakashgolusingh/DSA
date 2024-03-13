class Solution {
    public int pivotInteger(int n) {
        
        int sum = n*(n+1)/2;
        for(int i=n/2; i<=n; i++)
        {
            int temp = i*(i+1)/2;
            if(sum-temp+i == temp)
                return i;
        }
        return -1;
    }
}
