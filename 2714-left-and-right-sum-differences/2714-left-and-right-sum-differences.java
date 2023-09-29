class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l = nums.length;
        int leftSum [] = new int[l];
        int rightSum [] = new int [l];
        int ans [] = new int [l];
       
        // left Sum of Array
        for(int i=1;i<l;i++ ){
            leftSum[i]=leftSum[i-1]+nums[i-1];  
        }
        // Right Sum Of Array
        for(int i=l-2;i>=0;i-- ){
            rightSum[i]=rightSum[i+1]+nums[i+1];
        }
        for(int i=0;i<l;i++){
            // if(leftSum[i]>=rightSum[i]){
            //     ans[i]=leftSum[i]- rightSum[i];
            // }else{
            //     ans[i]= rightSum[i]- leftSum[i];
            // }
ans[i]=  (leftSum[i]>=rightSum[i]) ?leftSum[i]- rightSum[i]:rightSum[i]- leftSum[i];
        }
        return ans;

    }
}