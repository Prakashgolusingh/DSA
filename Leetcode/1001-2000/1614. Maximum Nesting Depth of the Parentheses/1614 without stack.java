class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int count=0;
        for(int i=0; i<s.length(); i++)
        {
            char cur = s.charAt(i);
            if(cur == '(')
                count++;
            ans = Math.max(count, ans);
            if(cur == ')')
                count--;
        }
        return ans;
    }
}
