class Solution {
    public int trap(int[] arr) {
        int n=arr.length;
        int arrr[]=new int[n];
        int l=0;
        for(int i=n-1;i>-1;i--)
        {
            if(arr[i]>l)
            {
                l=arr[i];
                arrr[i]=l;
            }
            else
                arrr[i]=l;
        }
        int arrl[]=new int[n];
        l=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>l)
            {
                l=arr[i];
                arrl[i]=l;
            }
            else
                arrl[i]=l;
        }
        int area=0;
        for(int i=0;i<n;i++)
        {
            int a=arrl[i];
            if(arrr[i]<a)
                a=arrr[i];
            int b=a-arr[i];
            if(b>0)
                 area+=b;  
        }
        return area;
    }
}
