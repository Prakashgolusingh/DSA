class Solution
{
    public int firstElementKTime(int n, int k, int[] a) { 
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i: a)
        {
            if(map.containsKey(i))
                map.put(i, map.get(i)+1);
            else
                map.put(i, 1);
            if(map.get(i) == k)
                return i;
        }
        return -1;
    } 
}
