class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> set1 = new HashSet<>();
        int j=0;
        for(int i=0; i<nums1.length; i++)
        {
            if(!set.contains(nums1[i]))
                set.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++)
        {
            if(set.contains(nums2[i]))
                set1.add(nums2[i]);
        }
        int n = set1.size();
        int arr[] = new int[n];
        for(int i=0; i<nums2.length; i++)
        {
            if(set1.contains(nums2[i]))
            {
                arr[j++] = nums2[i];
                set1.remove(nums2[i]);
            }
        }
        return arr;
    }
}
