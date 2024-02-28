

//User function Template for Java

class Solution{
    int DivisibleByEight(String s){
        int n = s.length();
        if(n>2)
        {
            int x = Integer.parseInt(s.substring(n-3));
            if(x%8==0)
                 return 1;
            return -1;
        }
        else
        {
            if(Integer.parseInt(s)%8==0)
                return 1;
            return -1;
        }
    }
}
