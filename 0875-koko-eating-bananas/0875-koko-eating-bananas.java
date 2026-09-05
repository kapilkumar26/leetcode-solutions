class Solution {
    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for (int i = 0; i < piles.length; i++) {
            high = Math.max(high, piles[i]);
        }

        while (low <= high) {

            int speed = low + (high - low) / 2;
            long totalhr = 0;

            for (int i = 0; i < piles.length; i++) {
                totalhr += ((long) piles[i] + speed - 1) / speed;
            }

            if (totalhr <= h) {
                high = speed - 1;
            } else {
                low = speed + 1;
            }
        }

        return low;
    }
}