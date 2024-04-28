class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> cur_arr = new ArrayList<>();
        recursion(candidates, target, ans, cur_arr, 0);
        return ans;    
    }
    public void recursion(int []candidates, int target, List<List<Integer>> ans, List<Integer> cur_arr, int idx)
    {
        // base case
        if(target == 0)
        {
            List<Integer> cur_ans = new ArrayList<>();
            cur_ans.addAll(cur_arr);
            ans.add(cur_ans);
            return;
        }
        if(target<0 || idx>=candidates.length)
            return;
        int pre = -1;
        for(int i=idx; i<candidates.length; i++)
        {
            if(pre != candidates[i])
            {
                cur_arr.add(candidates[i]);
                recursion(candidates, target-candidates[i], ans, cur_arr, i+1);
                pre = candidates[i];
                cur_arr.remove(cur_arr.size()-1);
            }
        }
    }
}
