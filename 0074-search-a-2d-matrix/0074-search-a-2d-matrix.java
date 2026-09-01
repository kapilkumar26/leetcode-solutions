class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
     if(matrix.length==0) return false;
     int n=matrix.length;  
     int m=matrix[0].length;
     int left=0;
     int right=(m*n)-1;   
     while(left<=right){
        int mid=(left+(right-left)/2);
        if(matrix[mid/m][mid%m]==target){
            return true;
        }
        if(matrix[mid/m][mid%m]>target){
            right=mid-1;
        }
        else{
            left=mid+1;
        }
     }
     return false;
    }
}