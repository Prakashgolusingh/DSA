class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int length1 = text1.length();
        int length2 = text2.length();
        return recursion(text1, text2, length1-1, length2-1);
    }
    public int recursion(String text1, String text2, int step1, int step2)
    {
        if(step1<0 || step2<0)
            return 0;
        if(text1.charAt(step1) == text2.charAt(step2))
            return 1+recursion(text1, text2, step1-1, step2-1);
        else
            return Math.max(recursion(text1, text2, step1-1, step2),recursion(text1, text2, step1, step2-1));
    }
}
