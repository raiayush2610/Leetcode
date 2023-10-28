class Solution {
    public int solve(int st,int end,int [][]dp){
        if(st>=end){
            return 0;
        }
        if(dp[st][end]!=-1){
            return dp[st][end];
        }
        int maxi = Integer.MAX_VALUE;
        for(int i=st;i<=end;i++){
            maxi = Math.min(maxi,i+Math.max(solve(st,i-1,dp),solve(i+1,end,dp)));
        }
        return dp[st][end]=maxi;
    } 
    public int getMoneyAmount(int n) {
        int dp[][] =new int [n+1][n+1];
        for(int i=1;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
         return solve(1,n,dp);
    }
}