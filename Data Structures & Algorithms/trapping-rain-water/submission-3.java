class Solution 
{
    public int trap(int[] height) 
    {
        // max water area
        int maxWaterArea = 0;

        // maximum heights from the left of every height
        int[] leftMaxHeights = new int[height.length];

        //there is no height on the left of the first element
        leftMaxHeights[0] = height[0];

        //find the heights for the other positions
        for(int i = 1; i < height.length; i++)
        {
            // We only have two options for the max height at the left of a position
            // either the max on its left or itself
            leftMaxHeights[i] = Math.max(leftMaxHeights[i-1], height[i]);
        }

        // maximum heights from the right of every height
        int[] rightMaxHeights = new int[height.length];

        //there is no height on the right of the last element
        rightMaxHeights[height.length - 1] = height[height.length - 1];

        //find the heights for the other positions
        for(int i = height.length - 2; i >=  0; i--)
        {
            // We only have two options for the max height at the right of a position
            // either the max on its right or itself
            rightMaxHeights[i] = Math.max(rightMaxHeights[i+1], height[i]);
        }

        //compute the water level at each position
        for(int i = 0; i < height.length; i++)
        {
            maxWaterArea += (Math.min(leftMaxHeights[i], rightMaxHeights[i]) - height[i]);
        }

        return maxWaterArea;
    }
}
