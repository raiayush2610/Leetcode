class Solution {
        public int solve(String a, String b, int i,int j,int dp[][]){
        if(i==a.length()){return 0;}
        if(j==b.length()){return 0;}
        if(dp[i][j]!= -1){
            return dp[i][j];
        }
        int ans=0;
        if(a.charAt(i)==b.charAt(j)){
            ans=1+solve(a,b,i+1,j+1,dp);
        }
        else{
            ans = Math.max(solve(a,b,i+1,j,dp),solve(a,b,i,j+1,dp));
        }
        dp[i][j]= ans;
        return dp[i][j];
    }
    public int longestPalindromeSubseq(String s) {
        StringBuilder sb = new StringBuilder(s);
         String t= sb.reverse().toString();

        int n= s.length();
        int m= t.length();
        int dp[][] =new int [n+1][m+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(s,t,0,0,dp);
    }
}