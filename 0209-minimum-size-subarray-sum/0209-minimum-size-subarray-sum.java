class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int sum=0;
        int left =0;
        int mlen=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
            while(sum>=target){
                mlen=Math.min(mlen, i-left+1);
                sum-=nums[left];
                left++;
            }
            }
            if(mlen==Integer.MAX_VALUE){
                return 0;
            }
            return mlen;

        }

    }
