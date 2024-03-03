class Solution {
    String printLargest(int n, String[] arr) {
        srt(arr, 0, n-1);
        String str = "";
        for(String i: arr)
            str += i;
        return str;
    }
    public void srt(String []arr, int l, int r)
    {
        if(l<r)
        {
            int mid = l+(r-l)/2;
            srt(arr, l, mid);
            srt(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }
    public void merge(String []arr, int l, int mid, int r)
    {
        String ar[] = new String[r-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while(j<=r && i<=mid)
        {
            if((arr[i]+arr[j]).compareTo(arr[j]+arr[i])<0)
                ar[k++] = arr[j++];
            else
                ar[k++] = arr[i++];
        }
        while(i<=mid)
            ar[k++] = arr[i++];
        while(j<=r)
            ar[k++] = arr[j++];
        i = l;
        k=0;
        while(i<=r)
            arr[i++] = ar[k++];
    }
}
