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
            int longu = 0;
            if(!set.contains(num - 1))
            {
                int length = 1;
                while(set.contains(num + length))
                {
                    length++;
                }

                longu = length;
            }

            longest = Math.max(longest, longu);
        }
        return longest;
    }
}
