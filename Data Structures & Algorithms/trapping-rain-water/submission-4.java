class Solution 
{
    public int trap(int[] height) 
    {
        int maxWaterAmount = 0;

        for(int i = 0; i < height.length; i++)
        {
            int left = i;
            int leftMax = 0;

            while(left > 0)
            {
                if(height[left] > height[leftMax])
                {
                    leftMax = left;
                }

                left--;
            }

            int right = i;
            int rightMax = height.length - 1;

            while(right < height.length - 1)
            {
                if(height[right] > height[rightMax])
                {
                    rightMax = right;
                }
                right++;
            }

            maxWaterAmount += (Math.min(height[leftMax], height[rightMax]) - height[i]);

        }

        return maxWaterAmount;
    }
}
