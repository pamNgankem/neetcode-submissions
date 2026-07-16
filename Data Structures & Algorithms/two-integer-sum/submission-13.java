class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // stores the nums' numbers with their respective indices
        HashMap<Integer, Integer> numPos = new HashMap<Integer, Integer>();

        // storing the numbers of nums and their respective indices in the hashmap
        for(int i = 0; i < nums.length; i++)
        {
            // get the complement of the current number
            int com = target - nums[i];

            // the complement of nums[i] is in the map
            if(numPos.containsKey(com))
            {
                return new int[]{numPos.get(com),i};
            }
            else
            {
                numPos.put(nums[i],i);
            }
        }

        return new int[]{};
    }
}
