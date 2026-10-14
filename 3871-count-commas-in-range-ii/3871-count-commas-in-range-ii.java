class Solution {
    public long countCommas(long n) {
        if (n <= 999) return 0;

        long Commas = 0;
        long start = 1000;

        while (start <= n) {
            Commas += n - start + 1;
            start *= 1000;
        }

        return Commas;
    }
}