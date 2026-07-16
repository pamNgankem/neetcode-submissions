class Solution 
{
    public int maxProfit(int[] prices) 
    {
        if(prices.length <= 1)
        {
            return 0;
        }
        
        int minBuyPrice = prices[0];
        int maxProfit = 0;

        for(int sell : prices)
        {
            maxProfit = Math.max(maxProfit, sell - minBuyPrice);

            minBuyPrice = Math.min(minBuyPrice, sell);
        }

        return maxProfit;
    }
}
