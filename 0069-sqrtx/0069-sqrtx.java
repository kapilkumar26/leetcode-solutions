class Solution {
    public int mySqrt(int x) {
        int l = 0, sqt = x;
        while (l <= sqt) {
            int mid = l + (sqt - l) / 2;
            if (mid <= x / Math.max(mid, 1)) 
            {
                if (mid * mid == x){
                    return mid;
                }
                l = mid + 1;
            }
            else {
                sqt = mid - 1;
            }
        }

        return sqt;
    }
}