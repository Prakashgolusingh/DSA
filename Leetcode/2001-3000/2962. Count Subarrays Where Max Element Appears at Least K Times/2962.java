class Solution {
    public long countSubarrays(int[] nums, int k) {
        long n = nums.length;
        int max=0, max_count=0;
        for(int i: nums)
        {
            if(i>max)
                max = i;
        }
        long total = n*(n+1)/2;
        long sub = 0;
        int right = 0, left = 0;
        while(right<n)
        {
            if(nums[right]==max)
                max_count++;
            while(max_count>=k)
            {
                if(nums[left]==max)
                    max_count--;
                left++;
            }
            sub += right-left+1;
            right++;
        }
        return (long)(total -sub);
    }
}
