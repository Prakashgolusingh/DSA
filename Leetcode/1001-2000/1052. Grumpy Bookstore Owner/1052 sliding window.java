class Solution {
    public int maxSatisfied(int[] customer, int[] grumpy, int m) {
        int n = grumpy.length;
        int cust[] = new int[n];
        for(int i=0; i<n; i++)
        {
            if(grumpy[i] == 1)
                cust[i] = customer[i];
        }
        int gsum = 0, sum = 0, left = 0, tleft = 0, right = 0, tright = 0;
        while(tright<n){
            sum += cust[tright];
            if(tright-tleft>=m){
                sum -= cust[tleft];
                tleft++;
            }
            if(sum>gsum){
                gsum = sum;
                left = tleft;
                right = tright;
            }
            tright++;
        }
        int ans = 0;
        for(int i=0; i<n; i++){
            if((i>=left && i<=right) || grumpy[i] == 0)
                ans += customer[i];
        }
        return ans;
    }
}
