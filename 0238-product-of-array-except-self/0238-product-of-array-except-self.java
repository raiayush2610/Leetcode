class Solution {
    public int[] productExceptSelf(int[] nums) {
       int n = nums.length;
       int []leftSum = new  int [n+1];
       int []rightSum = new int [n+1];
        leftSum[0]=1;
        rightSum[n-1]=1;
      for(int i = 1 ; i<leftSum.length;i++){
          leftSum[i]=  leftSum[i-1]*nums[i-1]; 
      }
       for(int i = n-2 ; i>=0;i--){
          rightSum[i]=  rightSum[i+1]*nums[i+1]; 
      }
      int ans [] = new int [n];
       for(int i = 0 ; i<n;i++){
          ans[i]=  rightSum[i]*leftSum[i]; 
      }
      return ans;

    }
}