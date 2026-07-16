class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        //sort the array
        Arrays.sort(nums);

        //check every number against the one that follows it
        for(int i = 0; i < nums.length - 1; i++)
        {
            if(nums[i] == nums[i+1])
            {
                return true;
            }
        }

        return false;
    }
}