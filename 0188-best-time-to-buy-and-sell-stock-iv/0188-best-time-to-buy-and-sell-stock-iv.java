class Solution {
    public int solTab(int []prices,int k){
        int n=prices.length;
        int  curr[][]= new int [2][k+1];
        int  next[][]= new int [2][k+1];
        for(int i=n-1;i>=0;i--){
            for(int buy =0;buy<=1;buy++){
                for(int limit=1;limit<=k;limit++){
                    int profit =0;
                    if(buy==1){
            int buykaro=-prices[i]+next[0][limit];
            int skipkaro=0+next[1][limit];
            profit =Math.max(buykaro,skipkaro);
        }else{
            int sellkaro =prices[i]+next[1][limit-1];
            int skipk= 0+next[0][limit];
            profit =Math.max(sellkaro,skipk);
        }
        curr[buy][limit]=profit;
        }
    }
    next=curr;
    }
       return  next[1][k];   
    }
    public int maxProfit(int k, int[] prices) {
        return solTab(prices,k);
    }
}