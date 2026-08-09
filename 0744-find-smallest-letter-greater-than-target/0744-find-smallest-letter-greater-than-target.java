class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char ch=letters[0];
        int tar=target-'a';
        for(int i=0;i<letters.length;i++){
            int t=(int)letters[i]-'a';
            if(t>tar) {
                ch= letters[i];
                break;
            }
        }
        return ch;
    }
}