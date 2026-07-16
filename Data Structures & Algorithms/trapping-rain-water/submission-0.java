class Solution 
{
    public int trap(int[] height) 
    {
        int waterArea = 0;

        for(int i = 0; i < height.length; i++)
        {
            int left = i;
            int leftMax = 0;
            while(left >= 0)
            {
                int leftMaxHeight = height[leftMax];
                if(height[left] >= leftMaxHeight)
                {
                    leftMax = left;
                }
                left--;
            }

            int right = i ;
            int rightMax = height.length - 1;
            
            while(right <= height.length - 1)
            {
                int rightMaxHeight = height[rightMax];
                if(height[right] > rightMaxHeight)
                {
                    rightMax = right;
                }
                right++;

            }

            waterArea = waterArea + (Math.min(height[leftMax], height[rightMax]) - height[i]);
        }
        
        return waterArea;
    }
}
