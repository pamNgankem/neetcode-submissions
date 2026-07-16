class Solution 
{
    public int largestRectangleArea(int[] heights) 
    {
        int maxArea = 0;

        for(int i = 0; i < heights.length; i++)
        {
            int minHeight = heights[i];

            // extend rectangle from the left
            int left = i;
            while(left >= 0 && heights[left] >= minHeight)
            {
                left--;
            }

            //extend rectangle from the right
            int right = i;
            while(right < heights.length && heights[right] >= minHeight)
            {
                right++;
            }

            right--;
            left++;

            //area of this rectangle
            int area = (right - left + 1) * minHeight;

            maxArea = Math.max(area, maxArea);
        }

        return maxArea;
    }
}
