class Solution {
public:
    int passThePillow(int n, int time) {
        if(time<n)
            return time+1;
        time -= n;
        int k = time/(n-1);
        time %= (n-1);
        if(k%2 == 0)
            return n-1-time;
        return 2+time;

    }
};
