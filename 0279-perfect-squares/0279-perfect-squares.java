class Solution {
    public int sol(int n){
      if(n==0){return 0;}
      int ans =n;
      for (int i= 1;i*i<=n;i++){
        ans= Math.min(ans,1+sol(n-i*i));
        }
        return ans;
    }
    public int solTab(int n,int []dp){
      if(n==0){return 0;}
      if(dp[n]!= -1){
        return dp[n];
      }
      int ans =n;
      for (int i= 1;i*i<=n;i++){
        ans= Math.min(ans,1+solTab(n-i*i,dp));
        }
        dp[n]= ans;
        return dp[n];
    }
    public int numSquares(int n) {
      int dp[] = new int[n+1];
      Arrays.fill(dp,-1); 
        return solTab(n,dp);
    }
}