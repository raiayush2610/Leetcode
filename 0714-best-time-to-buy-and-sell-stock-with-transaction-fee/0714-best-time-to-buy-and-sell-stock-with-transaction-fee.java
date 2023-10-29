class Solution {
    public int solveTab(int []prices,int fee){
        int n= prices.length;
        int curr[] = new int [2];
         int next[] = new int [2];

        for(int i=n-1;i>=0;i--){
            for(int buy =0;buy<=1;buy++){
                int profit =0;
                if(buy==1){
                    int buykaro=(-prices[i]+next[0]);
                    int skipkaro=0+next[1];
                    profit =Math.max(buykaro,skipkaro);
        }else{
            int sellkaro =+prices[i]+next[1]-fee;
            int skipk= 0+next[0];
            profit =Math.max(sellkaro,skipk);
        }
        curr[buy] = profit;
            }
        next =curr;
        }
        return next[1];
    }
    public int maxProfit(int[] prices, int fee) {
        return solveTab(prices,fee);
    }
}