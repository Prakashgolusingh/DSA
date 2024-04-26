class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur_arr = new ArrayList<>();
        recursion(candidates, ans, cur_arr, 0, 0, target);
        return ans;
    }
    public void recursion(int candidates[], List<List<Integer>> ans, List<Integer> cur_arr, int cur_sum, int cur_idx, int target)
    {
        if(candidates.length == cur_idx || cur_sum > target)
            return;
        if(cur_sum == target)
        {
            List<Integer> ans_arr = new ArrayList<>();    
            ans_arr.addAll(cur_arr);
            ans.add(ans_arr);
            return;
        }
        // include
        cur_arr.add(candidates[cur_idx]);
        recursion(candidates, ans, cur_arr, cur_sum+candidates[cur_idx], cur_idx, target);
        // exclude
        cur_arr.remove(cur_arr.size()-1);
        recursion(candidates, ans, cur_arr, cur_sum, cur_idx+1, target);
    }
}
