class Solution {
    public static int solMemoHelper(int i,int diff,int [] A, Map<Integer, Integer>[] dp){
        if(i<0){
            return 0;
        }
        int ans= 0;
         if (dp[i].containsKey(diff)) {
            return dp[i].get(diff);
        }
        for(int j=i-1;j>=0;j--){
            if(A[i]-A[j]==diff){
                ans=Math.max(ans,1+solMemoHelper(j,diff,A,dp));
            }
            
        }
        dp[i].put(diff, ans);
        return ans;
    }
    public int  solTab(int []A){
        int n =A.length;
        if(n<=2){
        return n;
    }
    Map<Integer, Integer>[] dp = new HashMap[n+1];

     // Initialize each element in the array
    for (int i = 0; i <= n; i++) {
        dp[i] = new HashMap<Integer, Integer>();
    }

     int ans = 0;
    for (int i = 1; i < n; i++) {
        for (int j = 0; j < i; j++) {
            int diff = A[i] - A[j];
            int c = 1;

            // Check if the answer is already present
            if (dp[j].containsKey(diff)) {
                c = dp[j].get(diff);
            }
            
            dp[i].put(diff, 1 + c);
            ans = Math.max(ans, dp[i].get(diff));
        }
    }

    return ans;
    }
    public int solMemo(int [] A ){
        int n =A.length;
        if(n<=2){
            return n;
        }
        Map<Integer, Integer>[] dp = new HashMap[n + 1];
        // Initialize each element in the array
        for (int i = 0; i <= n; i++) {
            dp[i] = new HashMap<Integer, Integer>();
        }
        // You can now use dp as an array of HashMaps
        int ans= 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ans =Math.max(ans,2+solMemoHelper(i,A[j]-A[i],A,dp));  
            }
        }
    return ans;
    }
    public int longestArithSeqLength(int[] A) {
         // return solMemo(A);
        return solTab(A);
    }
}