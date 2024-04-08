class Solution {
    public int countStudents(int[] st, int[] s) {
        int j=0, n = st.length;
        int ans = n;
        while(true)
        {
            int flag = 0;
            for(int i=0; i<n; i++)
            {
                if((st[i] == 0 && s[j]==0) || (st[i] == 1 && s[j]==1))
                {
                    j++;
                    st[i] = 2;
                    ans--;
                    flag = 1;
                }
            }
            if(flag == 0)
                return ans;
            
        }
    }
}
