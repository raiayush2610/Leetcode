class Solution {
    public int maxProfit(int[] prices) {
      int maxprofit=0;
        for(int i=1; i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                 maxprofit+=prices[i]-prices[i-1]; 
            }else{
                maxprofit += 0;
            }
            // profit += prices[i] > prices[i-1] ? prices[i]-prices[i-1] : 0;
        }
        return maxprofit;
    } 
    }