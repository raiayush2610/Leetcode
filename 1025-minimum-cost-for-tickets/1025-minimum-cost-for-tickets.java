class Solution {
  public static int  sol(int n, int[] days, int[] cost, int index,int []dp){
		if(index >= n){
			return 0;
		}
    if(dp[index]!=-1){
      return dp[index];
    }
		// 1 day pass
		int opt1= cost[0]+sol(n,days,cost,index+1,dp);

		int i;
		//7 Day pass
		for(i=index; i<n && days[i]<days[index]+7; i++);

		int opt2=cost[1]+sol(n,days,cost,i,dp);
		//30 days pass
		for(i= index;i<n&& days[i]<days[index]+30;i++);

		int opt3=cost[2]+sol(n,days,cost,i,dp);

		dp[index]= Math.min(opt1,Math.min(opt2,opt3));
    return dp[index];
	}
    public int mincostTickets(int[] days, int[] costs) {
      int n= days.length;
      int dp []= new int [n+1];
      Arrays.fill(dp,-1);

        return(sol(n,days,costs,0,dp));
    }
}