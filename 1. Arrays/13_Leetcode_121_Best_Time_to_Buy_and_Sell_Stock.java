class Solution {
    public int maxProfit(int[] prices) {
        
        int profit = 0;
        int buying_price = Integer.MAX_VALUE;
        int max_profit=0;
        
        for(int i=0; i<prices.length; i++){
            
            if(prices[i] < buying_price){
                
                buying_price = prices[i];
            }else{
            
                profit = prices[i] - buying_price;
                
            }
            
            if(profit>max_profit){
                
                max_profit = profit;
            }
        }
        
        return max_profit;
        
    }
}
