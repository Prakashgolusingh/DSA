class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int first1 = nums[0], first2 = nums[0];
        int last1 = 0, last2 = 0;
        if(n>1)
        {
            first2 = Math.max(nums[0], nums[1]);
            last1 = nums[1];
        }
        if(n>2)
            last2 = Math.max(nums[1], nums[2]);
        for(int i=2; i<n-1; i++)
        {
            int first = Math.max(nums[i]+first1, first2);
            first1 = first2;
            first2 = first;
            int last = Math.max(nums[i+1]+last1, last2);
            last1 = last2;
            last2 = last;
        }
        return Math.max(first2, last2);
    }
}
