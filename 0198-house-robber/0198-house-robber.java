class Solution {
    public int sol(int [] nums,int n,int []dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return nums[0];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int incl = sol(nums,n-2,dp)+nums[n];
        int excl = sol(nums,n-1,dp)+0;
        return dp[n]=Math.max(incl,excl);
    }
    public int rob(int[] nums) {
        int n= nums.length;
        int dp [] = new int [n+1];
        Arrays.fill(dp,-1);
        int ans= sol(nums,n-1, dp);
        return ans;
    }
}