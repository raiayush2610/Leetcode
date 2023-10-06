class Solution {
    public int IB(int n, int tar,int limi,int dp[][]){
        if(tar == 0)return 1;
        if(n>=limi){
            return 0;
        }
        if(dp[n][tar] !=-1)return dp[n][tar];
        
        if(n <= tar){
          dp[n][tar]= Math.max(n * IB(n ,tar-n,limi,dp), IB(n+1 ,tar,limi,dp));
        }
        else{
           dp[n][tar]= IB(n+1,tar,limi,dp);
        }
        return dp[n][tar];
    }
    public int integerBreak(int n) {
       int dp[][]  = new int [n][n+1];

       for(int [] row: dp){
           Arrays.fill(row,-1);
       }
       return IB(1,n,n,dp);
    }
}