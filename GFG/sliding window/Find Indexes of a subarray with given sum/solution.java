class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        ArrayList<Integer> result = new ArrayList<>();
        int left=0, right = 0;
        int cur_sum = 0;
        while(right<n)
        {
            cur_sum += arr[right];
            while(cur_sum>s)
            {
                cur_sum -= arr[left];
                left++;
            }
            if(cur_sum == s)
            {
                if(s == 0)
                {
                    if(left == right && arr[right] == 0)
                    {
                        result.add(left+1);
                        result.add(right+1);
                        return result;
                    }
                }
                else
                {
                    result.add(left+1);
                    result.add(right+1);
                    return result;
                }
            }
            right++;
        }
        result.add(-1);
        return result;
    }
}
