class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<num.length(); i++)
        {
            char c = num.charAt(i);
            while((!stk.isEmpty() && stk.peek()>c) && k>0)
            {
                stk.pop();
                k--;
            }
            stk.push(c);
        }
        while(k>0 && !stk.isEmpty())
        {
            stk.pop();
            k--;
        }
        String str = "";
        boolean flag = false;
        while(!stk.isEmpty())
        {
            if(stk.peek() != '0')
                flag = true;
            if(flag == true);
                str = stk.peek() + str;
            stk.pop();
        }
        if(str.compareTo("")==0)
            return "0";
        int i=0;
        while(i<str.length() && str.charAt(i) == '0')
            i++;
        String s = str.substring(i, str.length());
        if(s.compareTo("")==0)
            return "0";
        return s;
    }
}
