class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        //check every elemenet from nums
        for(int i = 0; i < nums.length;i++)
        {
            // check the current element against all the others
            for(int j = 0; j < nums.length; j++)
            {
                // do not compare the current element to itself
                if(j!= i)
                {
                    if(nums[i] == nums[j])
                    {
                        return true;
                    }
                }
            }
        }
        

        return false;
    }
}