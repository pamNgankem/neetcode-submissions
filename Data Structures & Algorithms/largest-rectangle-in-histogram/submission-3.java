class Solution 
{
    public int largestRectangleArea(int[] heights) 
    {
        int area = 0;

        for(int i = 0; i < heights.length; i++)
        {
            int left = i; 
            int right = i + 1;

            while( left >= 0 && heights[left] >= heights[i])
            {
                left--;
            }

            while( right < heights.length && heights[right] >= heights[i])
            {
                right++;
            }

            right--;
            left++;

            area = Math.max(area, (1 + right - left) * heights[i]);

        }

        return area;
    }
}
