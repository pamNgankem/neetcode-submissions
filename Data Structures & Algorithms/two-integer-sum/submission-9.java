class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // initialize resulting array
        int[] indices = new int[2];
        
        // iterate through every element of the array
        for(int i = 0; i < nums.length; i++)
        {
            //compare each element against the remaining ones
            for(int j =  i + 1; j < nums.length; j++)
            {
                // check if the sum of both elemts match the target
                if(nums[i] + nums[j] == target)
                {
                    return new int[]{i,j};
                }
            }
        }

        return indices;
    }
}
