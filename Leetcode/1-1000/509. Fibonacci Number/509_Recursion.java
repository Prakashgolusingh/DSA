class Solution {
    public int fib(int n) {
        return recursion(n);
    }
    public int recursion(int n)
    {
        if(n <2)
            return n;
        return recursion(n-1)+recursion(n-2);
    }
}
