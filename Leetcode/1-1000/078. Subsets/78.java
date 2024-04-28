class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        recursion(nums, ans, arr, 0);
        return ans;
    }
    public void recursion(int []nums, List<List<Integer>> ans, List<Integer> arr, int idx)
    {
        if(idx == nums.length)
        {
            List<Integer> cur_ans = new ArrayList<>();
            cur_ans.addAll(arr);
            ans.add(cur_ans);
            return;
        }
        // include
        arr.add(nums[idx]);
        recursion(nums, ans, arr, idx+1);
        arr.remove(arr.size()-1);
        recursion(nums, ans, arr, idx+1);
    }
}
