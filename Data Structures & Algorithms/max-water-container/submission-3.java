class Solution 
{
    public int maxArea(int[] heights) 
    {
        int left = 0;
        int right = heights.length - 1;
        int volume = 0;

        while(left < right)
        {
            int vol = (right - left) * Math.min(heights[left], heights[right]);

            volume = Math.max(vol, volume);
            if(heights[left] <= heights[right])
            {
                left++;
            }
            else
            {
                right--;
            }
            
        }

        return volume;
    }
}
