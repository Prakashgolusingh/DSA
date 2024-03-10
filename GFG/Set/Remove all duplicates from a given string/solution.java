class Solution {
    String removeDuplicates(String str) {
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++)
        {
            if(!set.contains(str.charAt(i)))
                set.add(str.charAt(i));
        }
        String s = "";
        for(int i=0; i<str.length(); i++)
        {
            if(set.contains(str.charAt(i)))
            {
                s += str.charAt(i);
                set.remove(str.charAt(i));
            }
        }
        return s;
    }
}
