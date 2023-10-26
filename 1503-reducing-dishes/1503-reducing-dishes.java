class Solution {
    public int sol(int[] satis, int i, int t,int [][]dp) {
        if (i == satis.length) return 0;
        if(dp[i][t]!= -1){
            return dp[i][t];
        }

        int include = satis[i] * (t + 1) + sol(satis, i + 1, t + 1,dp);
        int exclude = sol(satis, i + 1, t,dp);

        return dp[i][t]= Math.max(exclude, include);
    }

    public int maxSatisfaction(int[] satis) {
        Arrays.sort(satis); 
        // The maximum of including and excluding the current item
        int n=satis.length;
        int dp[][] =new int[n][n];
        for(int i=0 ;i<n;i++){
            Arrays.fill(dp[i],-1);
        }

        return sol(satis, 0, 0,dp);
    }
}
