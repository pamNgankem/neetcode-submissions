class Solution 
                                                                                                                                                                    {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] indices = new int[2];

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                int sum = nums[i] + nums[j];
                if(sum == target && i != j)
                {
                    indices[0] = i;
                    indices[1] = j;

                    return indices;
                }
            }
        }

        return indices;
        
    }
}
