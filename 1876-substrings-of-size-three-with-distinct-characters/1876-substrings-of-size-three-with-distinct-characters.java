class Solution {
    public int countGoodSubstrings(String s) {
      int cnt=0;
      int l=0;
      while(l<s.length()-2){
        if(s.charAt(l)!=s.charAt(l+1) && s.charAt(l+1)!=s.charAt(l+2) && s.charAt(l)!=s.charAt(l+2)){
            cnt++;
        }
        l++;
      }
      return cnt; 
    }
} 
  