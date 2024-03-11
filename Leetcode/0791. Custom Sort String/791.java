class Solution {
    public String customSortString(String order, String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);
            if(!map.containsKey(c))
                map.put(c, 1);
            else
                map.put(c, map.get(c)+1);
        }
        String str = "";
        for(int i=0; i<order.length(); i++)
        {
            char c = order.charAt(i);
            if(map.containsKey(c))
            {
                for(int j=0; j<map.get(c); j++)
                    str += c;
                map.remove(c);
            }
        }
        for(Character c: map.keySet())
        {
            for(int i=0; i<map.get(c); i++)
                str += c;
        }
        return str;
    }
}
