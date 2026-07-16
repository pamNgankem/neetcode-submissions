class Solution 
{
    public int maxProfit(int[] prices) 
    {
        // maximum profit
        int maxProfit = 0;
        
        //find the different profits that can be made
        for(int i = 0; i < prices.length - 1; i++)
        {
            //buying price
            int buyPrice = prices[i];

            //computing profits
            for(int j = i + 1; j < prices.length; j++)
            {
                int profit = prices[j] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit; 
    }
}
