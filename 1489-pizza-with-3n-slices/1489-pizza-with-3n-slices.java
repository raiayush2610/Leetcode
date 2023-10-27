class Solution {
    int solveMemo(int i,int ei,int[] slices, int n,int dp[][]){
        if(n==0 || i>ei){
            return 0;
        }
        if(dp[i][n]!=-1){
            return dp[i][n];
        }
        
        int take= slices[i] + solveMemo(i+2,ei,slices,n-1,dp);
        int notTake= 0 + solveMemo(i+1,ei,slices,n,dp);
        dp[i][n]= Math.max(take,notTake);
        return dp[i][n];
    }
    int solve(int i,int ei,int[] slices, int n){
        if(n==0 || i>ei){
            return 0;
        }
        
        int take=   slices[i] + solve(i+2,ei,slices,n-1);
        int notTake= 0 + solve(i+1,ei,slices,n);
        return Math.max(take,notTake);
    }
    public int maxSizeSlices(int[] slices) {
        int k= slices.length;
        int dp [][] = new int [k][k];
        int dp2 [][] = new int [k][k];
        for(int i=0;i<dp.length;i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<dp2.length;i++){
            Arrays.fill(dp2[i],-1);
        }

        // int case1 = solve(0,k-2,slices,k/3);
        // int case2= solve(1,k-1,slices,k/3);
        // return Math.max(case1,case2);

        int casem1 =  solveMemo(0,k-2,slices,k/3,dp);

        int casem2=  solveMemo(1,k-1,slices,k/3,dp2);
       return Math.max(casem1,casem2);
    }
}