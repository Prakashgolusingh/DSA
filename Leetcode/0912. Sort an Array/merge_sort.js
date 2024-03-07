/**
 * @param {number[]} nums
 * @return {number[]}
 */
var sortArray = function(nums) {
    mergeSort(nums, 0, nums.length-1);
    return nums;
};

var mergeSort = (nums, l, r)=>
{
    if(l<r)
    {
        let m = l+Math.floor((r-l)/2);
        mergeSort(nums, l, m);
        mergeSort(nums, m+1, r);
        merge(nums, l, r, m);
    }
}
var merge = function(nums, l, r, m){
    const arr = Array(r-l+1).fill(0);
    let k =0;
    let i = l;
    let j = m+1;
    
    while(i<=m && j<=r)
    {
        if(nums[i]<nums[j])
            arr[k++] = nums[i++];
        else
            arr[k++] = nums[j++];
    }
    while(j<=r)
        arr[k++] = nums[j++];
    while(i<=m)
        arr[k++] = nums[i++];
    i = l;
    k=0;
    while(i<=r)
        nums[i++] = arr[k++];
}
