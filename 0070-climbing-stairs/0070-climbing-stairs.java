class Solution {
    int ways(int n, int [] dp){
        if(n<0){
            return 0;
        }
        if( n==0){
            return 1;
        }
        if(dp[n]!= 0){
            return dp[n];
        }
        dp[n]=ways(n-1,dp)+ways(n-2, dp);
        return dp[n];
    }
    int ways2(int n){
        int ways[]= new int [n+1];
        ways[0]=1;
        for (int i=1;i<=n;i++){
            if(i==1){
                ways[i]=ways[i-1];
            }
            else{
                ways[i]=ways[i-1]+ways[i-2];
            }
        }
        return ways[n];
    }
    public int climbStairs(int n) {
        int [] dp = new int [n+1];
       return ways2(n); 
    }
}