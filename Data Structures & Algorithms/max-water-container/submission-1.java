class Solution 
{
    public int maxArea(int[] heights) 
    {
        int left = 0;
        int right = heights.length - 1;
        int volume = 0;

        while(left < right)
        {
            //int vol = (rigth - left) * Math.min(heights[left], heights[right]);

            int base = (right - left);
            int height = Math.min(heights[left], heights[right]);
            int vol = base * height;

            volume = Math.max(vol, volume);
            if(heights[left] == height)
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
