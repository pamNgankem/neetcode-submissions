class Solution 
{
    public int maxArea(int[] heights) 
    {
        int waterAmount = 0;

        for(int i = 0; i < heights.length; i++)
        {
            for(int j = 0; j < heights.length; j++)
            {
                if(i!= j)
                {
                    int amount = (j - i) * Math.min(heights[j], heights[i]);
                    waterAmount = Math.max(waterAmount, amount);
                }
            }
        }

        return waterAmount;
    }
}
