class Solution {
    public int findMaxLength(int[] nums) {
        int sum = 0;
        int size = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for(int i=0; i<nums.length; i++)
        {
            if(nums[i]==0)
                sum--;
            else
                sum++;
            if(map.containsKey(sum))
            {
                if(i-map.get(sum) >size)
                    size = i-map.get(sum);
            }
            else
                map.put(sum, i);
        }
        return size;
    }
}
