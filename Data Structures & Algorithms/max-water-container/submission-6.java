class Solution 
{
    public int maxArea(int[] heights) 
    {
        // maximum amount of water
        int maxWaterAmount = 0;

        // computing every pairs' water amount
        for(int i = 0; i < heights.length; i++)
        {
            for(int j = 0; j < heights.length; j++)
            {
                // amount of water for the pair (i,j)
                if(i != j)// skip duplicates
                {
                    int waterAmount = (j  - i) * Math.min(heights[i], heights[j]);
                    maxWaterAmount = Math.max(waterAmount,maxWaterAmount);
                }
            }
        }

        return maxWaterAmount;
    }
}
