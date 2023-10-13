class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int l= cost.length;
        int dp[] = new int [l+1];

        for(int i=2;i<l+1;i++){
            dp[i]= Math.min(cost[i-1]+dp[i-1],cost[i-2]+dp[i-2]);
        }
        return dp[l];
    }
}