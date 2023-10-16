class Solution {
    public int sol(int[]coins,int x , int dp[]){
        if(x== 0){
            return 0;
        }
        if(x<0){
            return Integer.MAX_VALUE;
        }
         if( dp[x]!= -1){
             return dp[x];
         }
        int mini =Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int ans = sol(coins,x-coins[i],dp);

            if(ans!= Integer.MAX_VALUE){
                mini = Math.min(mini, 1+ans);
            }
        }
        return dp[x]= mini;

    }
    public int coinChange(int[] coins, int amount) {
        int l= coins.length;
        int dp[]= new int[amount+1];
        
        Arrays.fill(dp,-1);
        

        int ans = sol(coins,amount, dp);
        if(ans ==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}