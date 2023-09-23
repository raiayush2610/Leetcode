class Solution {
    public int lcs(String str1, String str2, int len1, int len2, int dp[][]){
        if(len1 == 0 || len2== 0){
            return 0 ;
        }
        int ans1=0,ans2=0;
        if(dp[len1][len2]!=-1){
            return dp[len1][len2];
        }

        if(str1.charAt(len1-1)==str2.charAt(len2-1)){
            return dp[len1][len2]=lcs(str1,str2,len1-1,len2-1, dp) +1;
        }
        else {
            ans1 =lcs(str1,str2,len1-1,len2,dp);
            ans2 =lcs(str1,str2,len1,len2-1,dp);
            dp[len1][len2]= Math.max(ans1,ans2);
        }
        return dp[len1][len2];
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        int dp[][] = new int [l1+1][l2+1];
       for (int[] row : dp){
            Arrays.fill(row, -1);}


        return lcs(text1,text2,l1,l2,dp);
        
    }
}