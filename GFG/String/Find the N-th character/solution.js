class Solution {
    //Function to find the nth character in the given string with given values of R and N.
    nthCharacter(s, r, n) {
        for(let i=0; i<r; i++)
        {
            let str = "";
            for(let j=0; j<=n; j++)
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
