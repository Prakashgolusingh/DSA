//User function Template for Java

class Solution
{
    public List<String> AllPossibleStrings(String s)
    {
        List<String> a = recursion(s, s.length(), 0);
        Collections.sort(a);
        a.remove(0);
        return a;
    }
    public List<String> recursion(String s, int n, int cur)
    {
        if(cur == n)
        {
            List<String> arr = new ArrayList<>();
            arr.add("");
            return arr;
        }
        List<String> ar = recursion(s, n, cur+1);
        List<String> arr = new ArrayList<>();
        for(String i: ar)
            arr.add(s.charAt(cur)+i);
        for(String i: ar)
            arr.add(i);
        return arr;
    }
}
