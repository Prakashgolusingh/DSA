class Solution {
    public int findPeakElement(int[] arr) {
        int l = 0;
        int r = arr.length-1;
        if(r == 0)
            return r;
        if(arr[0]>arr[1])
            return 0;
        if(arr[r]>arr[r-1])
            return r;
            
        int mid = 0;
        while(l<r)
        {
            mid = l+(r-l)/2;
            if(mid == l || r == mid)
                return mid;
            if(arr[mid]>=arr[mid-1] && arr[mid]>=arr[mid+1])
                return mid;
            if(arr[mid+1]> arr[mid])
                l = mid;
            else
                r = mid;
        }
        return -1;
    }
}
