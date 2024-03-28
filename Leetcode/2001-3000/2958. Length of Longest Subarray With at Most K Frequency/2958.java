class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0, left=0, right = 0 ;
        while(right<nums.length)
        {
            if(map.containsKey(nums[right]))
                map.put(nums[right], map.get(nums[right])+1);
            else
                map.put(nums[right], 1);
            while(map.get(nums[right])>k)
            {
                map.put(nums[left], map.get(nums[left])-1);
                left++;
            }
            max = Math.max(max, right-left+1);
            right++;
        }
        return max;
    }
}
