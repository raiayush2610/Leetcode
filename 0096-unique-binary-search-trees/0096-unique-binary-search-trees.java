class Solution {
  
    public int catla(int n,int []dp){
        if(n==0 || n==1){
            return 1;
        }
        if(dp[n]!= -1){
            return dp[n];
        }
        int ans =0;
        for(int i=0;i<n;i++){
            ans +=catla(i,dp)*catla(n-i-1,dp);
        }
       return dp[n]= ans;
    }

    public int numTrees(int n) {
        int [] dp = new int [n+1];
       Arrays.fill(dp,-1);
       //dp[0]=dp[1]=1;
    //    for(int i=2;i<=n;i++){
    //        for(int j=0;j<i;j++){
    //            dp[i]+=dp[j]*dp[i-j-1];
    //        }
    //    }
        return catla(n,dp);
        // return dp[n];
    }
}