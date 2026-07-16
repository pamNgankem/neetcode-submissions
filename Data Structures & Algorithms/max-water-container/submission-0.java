class Solution 
{
    public int maxArea(int[] heights) 
    {
        //int right = heights - 1;
        //int left = 0;
        int volume = 0;

        for(int i = 0; i < heights.length; i++)
        {
            for(int j = heights.length - 1; j > i ; j--)
            {
                int base = (j - i);
                int height = Math.min(heights[i], heights[j]);
                int vol = base * height;
                volume = Math.max(vol, volume);
            }
        }

        return volume;
    }
}
