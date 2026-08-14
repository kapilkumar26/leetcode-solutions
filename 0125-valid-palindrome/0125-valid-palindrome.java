class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase();
        StringBuffer sb = new StringBuffer(s);
        String rev = sb.reverse().toString();
        return s.equals(rev);
    }
}