class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur_arr = new ArrayList<>();
        recursion(ans, cur_arr, 1, n, k);
        return ans;
    }
    public void recursion(List<List<Integer>> ans, List<Integer> cur_arr, int cur_step, int target, int k)
    {
        if(target == 0 && k == 0)
        {
            List<Integer> cur_ans = new ArrayList<>();
            cur_ans.addAll(cur_arr);
            ans.add(cur_ans);
            return;
        }
        if((target<0 || k<=0) || cur_step>9)
            return;
        // Include
        cur_arr.add(cur_step);
        recursion(ans, cur_arr, cur_step+1, target-cur_step,k-1);
        cur_arr.remove(cur_arr.size()-1);
        recursion(ans, cur_arr, cur_step+1, target, k);
    }
}
