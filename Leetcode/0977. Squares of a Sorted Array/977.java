class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n; i++)
        {
            nums[i] = nums[i]*nums[i];
        }
        int arr[] = new int[n];
        int i=0;
        int j=n-1;
        int k = n-1;
        while(i<=j)
        {
            if (nums[i]>nums[j])
            {
                arr[k] = nums[i];
                i++;
            }
            else
            {
                arr[k] = nums[j];
                j--;
            }
            k--; 
        }
        return arr;
    }
}
