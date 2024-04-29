class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n>1)
            nums[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++)
            nums[i] = Math.max(nums[i]+nums[i-2], nums[i-1]);
        return nums[n-1];
    }
}
// just in case we don't want to change source array, we need to create extra space
class Solution {
    public int rob(int[] nums) {
        int n = nums.length, pre1 = nums[0], pre2 = nums[0];
        if(n>1)
            pre2 = Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++)
        {
            int temp = Math.max(nums[i]+pre1, pre2);
            pre1 = pre2;
            pre2 = temp;
        }   
        return pre2;
    }
}
