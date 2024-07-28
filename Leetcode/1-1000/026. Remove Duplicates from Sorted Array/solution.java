class Solution {
    public int removeDuplicates(int[] nums) {
        int step =1, k = 1;
        for(int i =1; i<nums.length; i++)
        {
            int cur = nums[i];
            if(cur != nums[step-1])
            {
                nums[step] = cur;
                step++;
                k++; 
            }
        }
        return k;
    }
}
