class Solution {
    public int  sol(int i, int buy ,int [] prices,int dp[][]){
        if(i==prices.length){
            return 0;
        }
        int profit=0;
        if(dp[i][buy]!=-1){
            return dp[i][buy];
        }
        if(buy==1){
            int buykaro=(-prices[i]+sol(i+1,0,prices,dp));
            int skipkaro=0+sol(i+1,1,prices,dp);
            profit =Math.max(buykaro,skipkaro);
        }else{
            int sellkaro =(+prices[i]+sol(i+1,1,prices,dp));
            int skipk= 0+sol(i+1,0,prices,dp);
            profit =Math.max(sellkaro,skipk);
        }
       return  dp[i][buy] = profit;
      

    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int dp [][] =new int [n][2];
        for(int i=0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
       return sol(0,1,prices,dp);
    }
}