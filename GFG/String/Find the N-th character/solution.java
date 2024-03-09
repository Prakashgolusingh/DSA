class Solution
{
    public char nthCharacter(String s, int r, int n)
    {
        char ans[] = new char[1];
        for(int i=0; i<r; i++)
        {
            String str = "";
            for(int j=0; j<=n; j++)
            {
                if(s.charAt(j)=='1')
                    str += "10";
                else
                    str += "01";
            }
            s=str;
            //System.out.println(str+" Hello "+s);
        }
        
        return s.charAt(n);
    }
}
