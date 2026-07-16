class Solution 
{
    public int maxArea(int[] heights) 
    {
        int l = 0;
        int r = heights.length - 1;

        int maxArea = 0;

        while(l < r)
        {
            int minHeight = Math.min(heights[l], heights[r]);
            int area = minHeight * (r - l);
            maxArea = Math.max(maxArea, area);

            if(minHeight == heights[l])
            {
                l++;
            }
            else
            {
                r--;
            }
        }

        return maxArea;
    }
}
