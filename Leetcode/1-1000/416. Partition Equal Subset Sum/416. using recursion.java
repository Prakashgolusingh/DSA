class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i: nums)
            sum += i;
        if(sum%2 != 0)
            return false;
        int target = sum/2;
        boolean ans = recursion(nums, nums.length-1, target);
        return ans;
    }
    boolean recursion(int arr[], int step, int target)
    {
        if(target == 0)
            return true;
        else if(step<0 || target<0)
            return false;
        boolean exclude = recursion(arr, step-1, target);
        if(exclude)
            return true;
        boolean include = recursion(arr, step-1, target-arr[step]);
            return (exclude || include);
    }
}
