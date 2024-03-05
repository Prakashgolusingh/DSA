class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        Stack<Long> stk = new Stack<>();
        long ans[] = new long[n];
        for(int i=n-1; i>=0; i--)
        {
            while(!stk.isEmpty() && stk.peek()<= arr[i])
                stk.pop();
            if(!stk.isEmpty())
                ans[i] = stk.peek();
            else
                ans[i] = -1;
            stk.push(arr[i]);
        }
        return ans;
    } 
}
