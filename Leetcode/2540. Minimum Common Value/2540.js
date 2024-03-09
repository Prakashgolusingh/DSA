/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var getCommon = function(nums1, nums2) {
    let l1 = 0;
        let l2 = 0;
        while(l1<nums1.length && l2<nums2.length)
        {
            if(nums1[l1]>nums2[l2])
                l2++;
            else if(nums1[l1]<nums2[l2])
                l1++;
            else
            {
                return nums1[l1];
            }
        }
        return -1;
};
