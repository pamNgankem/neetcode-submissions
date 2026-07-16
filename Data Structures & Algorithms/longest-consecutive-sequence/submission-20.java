class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }

        int longest = 0;

        for(int num : set)
        {
            int length = 1;
            if(!set.contains(num - 1))
            {
                while(set.contains(num + length))
                {
                    length++;
                }
            }

            longest = Math.max(longest, length);
        }
        return longest;
    }
}
