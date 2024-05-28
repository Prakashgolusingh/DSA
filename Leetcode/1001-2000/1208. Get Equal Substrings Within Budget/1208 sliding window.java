class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int left = 0, right = 0, sum = 0, ans = 0;
        while(right< s.length())
        {
            sum += Math.abs(s.charAt(right) - t.charAt(right));
            while(sum> maxCost)
            {
                sum -= Math.abs(s.charAt(left)-t.charAt(left));
                left++;
            }
            if( right-left>=ans)
                ans = 1+right-left;
            right++;
        }
        return ans;
    }
}
