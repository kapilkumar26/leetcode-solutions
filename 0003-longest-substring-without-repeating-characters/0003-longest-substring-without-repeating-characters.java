class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxLen = 0;

        int[] last = new int[128];

        for (int right = 0; right < s.length(); right++) {

            char ch = s.charAt(right);

            left = Math.max(left, last[ch]);

            maxLen = Math.max(maxLen, right - left + 1);

            last[ch] = right + 1;
        }

        return maxLen;
    }
}