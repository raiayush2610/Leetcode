class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l = nums.length;
        int leftSum [] = new int[l];
        int rightSum [] = new int [l];
        int ans [] = new int [l];
        for(int i=1;i<l;i++ ){
            if(nums[i]!=0 ||nums[i+1]!=0){
                leftSum[i]=leftSum[i-1]+nums[i-1];
            }
        }
        for(int i= 0;i<leftSum.length;i++){
            System.out.print(leftSum[i]);
        }
        for(int i=l-2;i>=0;i-- ){
            if(nums[i]!=0 ||nums[i+1]!=0){
                rightSum[i]=rightSum[i+1]+nums[i+1];
            }
        }
        for(int i=0;i<l;i++){
            if(leftSum[i]>=rightSum[i]){
                ans[i]=leftSum[i]- rightSum[i];
            }else{
                ans[i]= rightSum[i]- leftSum[i];
            }
        }
        return ans;

    }
}