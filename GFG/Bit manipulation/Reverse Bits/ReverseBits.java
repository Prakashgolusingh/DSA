class Solution {
    static Long reversedBits(Long x) {
        String str = Long.toBinaryString(x);
        while(str.length()<32)
            str = "0"+str;
        str = new StringBuilder(str).reverse().toString();
        return Long.parseLong(str, 2);
    }
};
