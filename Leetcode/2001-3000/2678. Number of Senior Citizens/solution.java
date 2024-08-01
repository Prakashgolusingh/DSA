class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for(int i=0; i<details.length; i++)
        {
            if("60".compareTo(details[i].substring(11,13))<0)
                ans++;
        }
        return ans;
    }
}
