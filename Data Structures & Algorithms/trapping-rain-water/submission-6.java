class Solution 
{
    public int trap(int[] height) 
    {
        int maxArea = 0;

        for(int i = 0; i < height.length; i++)
        {
            int lMax = 0;
            int l = i;

            while(l >= 0)
            {
                if(height[l] > height[lMax])
                {
                    lMax = l;
                }
                l--;
            }

            int rMax = height.length - 1;
            int r = i;

            while(r <= height.length - 1)
            {
                if(height[r] > height[rMax])
                {
                    rMax = r;
                }
                r++;
            }

            int waterLevel = Math.abs(Math.min(height[lMax], height[rMax]) - height[i]);

            maxArea += waterLevel;
        }

        return maxArea;
    }
}
