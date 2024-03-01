class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one = 0;
        int n = s.length();
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i) == '1')
                one++;
        }
        if(one==0)
            return s;
        String str = "";
        n -= one;
        while(one>1)
        {
            str += '1';
            one--;
        }
        while(n>0)
        {
            str += '0';
            n--;
        }
            
        str += '1';
        return str;
    }
}
