
//User function Template for Java

class Solution {
    ArrayList<String> NBitBinary(int N) {
        // code here
        ArrayList<String> arr = new ArrayList<>();
        bit(N, 1, 1, "1", arr);
        return arr;
    }
    void bit(int n, int size, int one, String str, ArrayList<String> arr)
    {
        if(size == n)
            arr.add(str);
        else
        {
            bit(n, size+1, one+1, str+"1", arr);
            if(size-one<one)
                bit(n, size+1, one, str+"0", arr);
        }
    }
}
