class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int ans = 0;
        int limit = tickets[k];
        for(int i=0; i<tickets.length; i++)
        {
            if(i>k)
                ans += Math.min(tickets[i], limit-1);
            else
                ans += Math.min(tickets[i], limit);
        }
        return ans;
    }
}
