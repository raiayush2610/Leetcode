class Solution {
  //int mod=1000000007;
   
    public static int solMemo(int dice, int face,int tar,int dp[][],int mod ){
        if(tar < 0){
            return 0;
        }
        if(dice==0 && tar !=0){
            return 0;
        }
        // if(tar== 0 && dice!=0){
        //     return 0;
        // }
        if(dice==0 && tar==0){
            return 1;
        }
        if(dp[dice][tar]!=-1){
            return dp[dice][tar];
        }
        int ans=0;
               
        for(int i=1;i<=face;i++){
            ans=(ans+solMemo(dice-1,face,tar-i,dp,mod))%mod;
        }
        //dp[dice][tar] = ans;
        return dp[dice][tar] = (int)(ans%mod);
    }
    public int numRollsToTarget(int n, int k, int target) {
        int dp[][] = new int[n+1][target+1];
         int mod=(int)(1e9+7);
        for(int [] i: dp){
            Arrays.fill(i,-1);
        }
        return solMemo(n,k, target,dp,mod) ;
    }
}