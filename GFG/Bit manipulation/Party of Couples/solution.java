
class Solution{
    static int findSingle(int n, int arr[]){
        int ans = 0;
        for(int i: arr)
            ans = ans^i;
        return ans ;
    }
}
