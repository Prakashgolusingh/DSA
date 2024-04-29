// Recursion (TLE)
class Solution {
    public int rob(int[] nums) {
        return Math.max(recursion(nums, nums.length-1), recursion(nums, nums.length-2));
    }
    public int recursion(int nums[], int idx)
    {
        if(idx<0)
            return 0;
        int include = nums[idx]+ recursion(nums, idx-2);
        int exclude = recursion(nums, idx-1);
        return Math.max(include, exclude);
    }
}
