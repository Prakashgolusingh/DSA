class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        if(k<1)
            return 0;
        int n = arr.length;
        int count = 0;
        for(int i=0; i<n; i++)
        {
            long product = 1;
            for(int j=i; j<n; j++)
            {
                product *= arr[j];
                if(product<k)
                    count++;
                else
                    break;
            }
        }
        return count;
    }
}
