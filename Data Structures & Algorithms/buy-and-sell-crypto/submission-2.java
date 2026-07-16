class Solution 
{
    public int maxProfit(int[] prices) 
    {
        if(prices.length <= 1)
        {
            return 0;
        }

        int[] profits = new int[prices.length - 1];

        for(int i = 0; i < prices.length - 1; i++)
        {
            int maxProfit = 0;
            for(int j = i + 1; j < prices.length; j++)
            {
                int profit = prices[j] - prices[i];
                if(profit > maxProfit)
                {
                    maxProfit = profit;
                }
            }

            profits[i] = maxProfit;
        }

        int maxProf = profits[0];
        for(int j =  1; j < profits.length; j++)
        {
            if(profits[j] > maxProf)
            {
                maxProf = profits[j];
            }
        }

        return maxProf;

    }
}
