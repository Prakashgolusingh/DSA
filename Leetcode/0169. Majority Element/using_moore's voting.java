class Solution {
    public int majorityElement(int[] nums) {
        int el = 0;
        int count = 0;
        int size = nums.length;
        for(int i=0; i<size; i++)
        {
            if(count == 0)
            {
                el = nums[i];
                count++;
            }
            else
            {
                if(nums[i] == el)
                    count++;
                else
                    count--;
            }
        }
        count = 0;
        for(int i: nums)
        {
            if(i == el)
                count++;
        }
        if(count>size/2)
            return el;
        return -1;
    }
}
