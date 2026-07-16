class Solution 
{
    public boolean hasDuplicate(int[] nums) 
    {
        // stores unique values of nums
        HashSet<Integer> set = new HashSet<Integer>();

        //add all elements form nums to the set
        for(int i = 0; i < nums.length; i++)
        {
            // the element is already in the set, there is a duplicate number
            if(set.contains(nums[i]))
            {
                return true;
            }
            else
            {
                set.add(nums[i]);
            }
        }

        return false;
    }
}