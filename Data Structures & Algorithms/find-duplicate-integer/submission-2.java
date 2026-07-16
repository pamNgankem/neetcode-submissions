class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        // set tto store unique elements from num
        HashSet<Integer> remDuplicate = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            //if the elements is already in the set, duplicate found
            if(remDuplicate.contains(nums[i]))
            {
                return nums[i];
            }
            {
                // add number to the set
                remDuplicate.add(nums[i]);
            }
        }

        return 0;
    }
}
