class Solution {
    public double findMaxAverage(int[] nums, int k) {
     int left=0;
     int sum=0;
     int max=0;
     for(int i=0; i<k; i++){
      sum+=nums[i];
     }  
     max=sum;
     for(int j=k; j<nums.length; j++){
       sum=sum-nums[left++]+nums[j];
       max=Math.max(sum,max);
     } 
     return (double)max/k;
    }
}