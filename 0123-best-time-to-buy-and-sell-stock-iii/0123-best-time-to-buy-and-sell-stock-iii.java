class Solution {
     public int  sol(int i, int buy ,int [] prices,int limit,int [][][] dp){
        if(i==prices.length){
            return 0;
        }
        if(limit== 0){
            return 0;
        }
        int profit=0;
        if(dp[i][buy][limit]!=-1){
            return dp[i][buy][limit];
        }
        if(buy==1){
            int buykaro=(-prices[i]+sol(i+1,0,prices,limit,dp));
            int skipkaro=0+sol(i+1,1,prices,limit,dp);
            profit =Math.max(buykaro,skipkaro);
        }else{
            int sellkaro =(+prices[i]+sol(i+1,1,prices,limit-1,dp));
            int skipk= 0+sol(i+1,0,prices,limit,dp);
            profit =Math.max(sellkaro,skipk);
        }
       return  dp[i][buy][limit] = profit;
       //return profit;
      

    }
    public int maxProfit(int[] prices) {
        int n= prices.length;
        int[][][] dp = new int[n][2][3];
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < 2; y++) {
                for (int z = 0; z < 3; z++) {
                    dp[x][y][z] = -1; // You can initialize with any appropriate values
                }
            }
        }
     return sol(0,1,prices,2,dp);
    }
}