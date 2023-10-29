class Solution {
    public int  sol(int i,int on,int k,int []prices,int dp[][]){
        if(i== prices.length){
            return 0;
        }
        if(on ==2*k){
            return 0;
        }
        if(dp[i][on]!=-1){
            return dp[i][on];
        }
        int profit =0;
        if(on %2 == 0){
            // buy allowed
            int buykaro=(-prices[i]+sol(i+1,on+1,k,prices,dp));
            int skipkaro=0+sol(i+1,on,k,prices,dp);
            profit =Math.max(buykaro,skipkaro);
        }
        else{
            int sellkaro =(+prices[i]+sol(i+1,on+1,k,prices,dp));
            int skipk= 0+sol(i+1,on,k,prices,dp);
            profit =Math.max(sellkaro,skipk);
        }
        dp[i][on]=profit;
        return dp[i][on];
    }
    public int maxProfit(int k, int[] prices) {
        int n=prices.length;
        int dp [][] =new int [n][2*k];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        return sol(0,0,k,prices,dp);
    }
}