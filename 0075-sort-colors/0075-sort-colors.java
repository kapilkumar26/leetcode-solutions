class Solution {
    public void sortColors(int[] nums) {
    int low=0;
    int mid=0;
    int high=nums.length-1;
    while(mid<=high){
    if(nums[mid]==0){
        int res=nums[mid];
        nums[mid]=nums[low];
        nums[low]=res;
        mid++;
        low++;
    } 
    else if(nums[mid]==1){
        mid++;
    }   
    else{
        int res=nums[high];
        nums[high]=nums[mid];
        nums[mid]=res;
        high--;
    }
    }
    }
}