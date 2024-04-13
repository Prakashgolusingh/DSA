class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer> stk = new Stack<>();
        for(int i=0; i<n; i++)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
                stk.pop();
            if(stk.isEmpty())
                left[i] = -1;
            else
                left[i] = stk.peek();
            stk.push(i);
        }
        stk.clear();
        for(int i=n-1; i>=0; i--)
        {
            while(!stk.isEmpty() && heights[stk.peek()] >= heights[i])
                stk.pop();
            if(stk.isEmpty())
                right[i] = n;
            else
                right[i] = stk.peek();
            stk.push(i);
        }
        int ans = 0;
        for(int i=0; i<n; i++)
        {
            left[i] = right[i]-left[i]-1;
            int temp = heights[i]*left[i];
            if(temp>ans)
                ans = temp;
        }
        return ans;
    }
}
