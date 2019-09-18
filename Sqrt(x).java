class Solution {
public:
    int mySqrt(int x) {
        long low = 1,high = x,mid = 0,last=0;
        while(low<=high) {
            mid = (low+high)/2;
            if(mid*mid == x) return (int)mid;
            else if(mid*mid < x) {
                last=mid;
                low = mid + 1;
            }
            else high = mid - 1;
        }
        return (int)last;
    }
};