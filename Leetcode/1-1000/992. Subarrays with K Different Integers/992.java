class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left = 0, right = 0;
        int less_equal = 0, equal = 0;
        while(right<nums.length)
        {
            int cur = nums[right];
            if(map.containsKey(cur))
                map.put(cur, map.get(cur)+1);
            else
                map.put(cur, 1);
            while(map.size()>k)
            {
                int pre = nums[left];
                map.put(pre, map.get(pre)-1);
                if(map.get(pre)==0)
                    map.remove(pre);
                left++;
            }
            less_equal += right-left+1;
            right++;
        }
        map = new HashMap<>();
        right = 0;
        left = 0;
        while(right<nums.length)
        {
            int cur = nums[right];
            if(map.containsKey(cur))
                map.put(cur, map.get(cur)+1);
            else
                map.put(cur, 1);
            while(map.size()>=k)
            {
                int pre = nums[left];
                map.put(pre, map.get(pre)-1);
                if(map.get(pre)==0)
                    map.remove(pre);
                left++;
            }
            equal += right-left+1;
            right++;
        }
        return less_equal-equal;
    }
}
