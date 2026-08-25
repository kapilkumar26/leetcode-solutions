class Solution {
    public int missingMultiple(int[] nums, int k) {
        int x = k;
        while (true) {
            boolean found = false;
            for (int i = 0; i < nums.length; i++) {

                if (nums[i] == x) {
                    found = true;
                }
            }
            if (found == false) {
                return x;
            }
            x = x + k;
        }
    }
}