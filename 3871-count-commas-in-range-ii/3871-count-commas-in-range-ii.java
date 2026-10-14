class Solution {
    public long countCommas(long n) {
        long commas = 0;

        for (long p = 1000; p <= n; ) {
            commas += n - p + 1;

            if (p > n / 1000) {
                break;
            }

            p *= 1000;
        }

        return commas;
    }
}