class Solution {
    public int maxProfit(int[] prices) {
        int buy= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length;i++){
            if(buy<prices[i]){
                int profit=prices[i]-buy;
                maxprofit=Math.max(maxprofit,profit);
            }else{
                buy =prices[i];
            }
        }
        return maxprofit;
    }
}