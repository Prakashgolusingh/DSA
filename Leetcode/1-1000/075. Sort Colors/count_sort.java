class Solution {
    public void sortColors(int[] nums) {
        int count_0 = 0, count_1=0;
        for(int i: nums)
        {
            if(i ==0)
                count_0++;
            else if(i ==1)
                count_1++;
        }
        int i=0;
        while(count_0>0)
        {
            nums[i] = 0;
            i++;
            count_0--;
        }
        while(count_1 > 0)
        {
            nums[i] = 1;
            i++;
            count_1--;
        }
        while(i < nums.length)
        {
            nums[i] = 2;
            i++;
        }
    }
}
