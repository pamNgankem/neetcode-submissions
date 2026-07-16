class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        // map stores each number in the array with its index
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        // look at each element in the array
        for(int i = 0; i < nums.length; i++)
        {
            // get the number to add to the current element to get target
            int diff = target - nums[i];

            //if that elements is not in the map add the cuurent number in the map
            if(!map.containsKey(diff))
            {
                map.put(nums[i], i);
            }
            else
            {
                return new int[]{map.get(diff), i}; // we found it. Stop here
            }
        }

        return new int[] {};// we did not fing any, return an dummy array.

    }
}
