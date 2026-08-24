class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int left=0;
     double avg=0;
     double sum=0;
     double max=0;
     for(int i=0; i<k; i++){
      sum+=nums[i];
     }  
     avg=sum/k;
     max=avg;
     for(int j=k; j<nums.length; j++){
       sum=sum-nums[left++]+nums[j];
       avg=sum/k;
       max=Math.max(avg,max);
     } 
     return max;
    }
}