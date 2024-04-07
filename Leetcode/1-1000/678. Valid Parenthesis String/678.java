class Solution {
    public boolean checkValidString(String s) {
        int count=0, star=0;
        for(int i=0; i<s.length(); i++)
        {
            char c=s.charAt(i);
            if(c=='(')
                count++;
            else if(c == ')')
            {
                if(count <=0)
                {
                    if(star<=0)
                        return false;
                    else
                        star--;
                }
                else
                    count--; 
            }
            else if(c == '*')
                star++;
        }
        count=0;
        star=0;
        for(int i=s.length()-1; i>=0; i--)
        {
            char c=s.charAt(i);
            if(c==')')
                count++;
            else if(c == '(')
            {
                if(count <=0)
                {
                    if(star<=0)
                        return false;
                    else
                        star--;
                }
                else
                    count--; 
            }
            else if(c == '*')
                star++;
        }
        return true;
    }
}
