class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
        HashSet<Integer> set = new HashSet<>();
        for(int i: b)
            set.add(i);
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i: a)
        {
            if(!set.contains(i))
                ans.add(i);
        }
        return ans;
    }
}
