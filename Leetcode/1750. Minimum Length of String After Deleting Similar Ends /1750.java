class Solution {
    public int minimumLength(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j && s.charAt(i) == s.charAt(j))
        {
            i++;
            j--;
            while(i<=j && s.charAt(i)==s.charAt(i-1))
                i++;
            while(j>=i && s.charAt(j) == s.charAt(j+1))
                j--;
        }
        return j-i+1;
   }
}
