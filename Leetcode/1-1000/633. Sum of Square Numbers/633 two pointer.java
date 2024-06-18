class Solution {
    public boolean judgeSquareSum(int c) {
        long left = 0, right = (long)Math.sqrt(c);
        while(left<=right)
        {
            long sum = left*left + right*right;
            if( sum== c)
                return true;
            else if( sum> c)
                right--;
            else
                left++;
        }
        return false;
    }
}
