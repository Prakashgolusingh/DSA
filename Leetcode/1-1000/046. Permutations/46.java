class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        boolean vis[] = new boolean[nums.length];
        recursion(nums, ans, arr, vis);
        return ans;
    }
    public void recursion(int nums[], List<List<Integer>> ans, List<Integer> arr, boolean vis[])
    {
        // base case
        if(arr.size() == nums.length)
        {
            List<Integer> cur_ans = new ArrayList<>();
            cur_ans.addAll(arr);
            ans.add(cur_ans);
            return;
        }
        for(int i=0; i<nums.length; i++)
        {
            if(!vis[i])
            {
                vis[i] = true;
                arr.add(nums[i]);
                recursion(nums, ans, arr, vis);
                arr.remove(arr.size()-1);
                vis[i] = false;
            }
        }
    }
}
