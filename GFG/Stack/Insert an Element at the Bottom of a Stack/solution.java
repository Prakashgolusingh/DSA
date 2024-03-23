
//User function Template for Java
class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> stk = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
        stk.push(x);
        while(!st.isEmpty())
        {
            arr.add(st.pop());
        }
        for(int i=arr.size()-1; i>=0; i--)
            stk.push(arr.get(i));
        return stk;
    }
}
