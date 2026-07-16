class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<Integer>();

        for(int num : nums)
        {
            set.add(num);
        }

        int best = 0;

        for(int num : set)
        {
            if(!set.contains(num - 1))
            {
                int len = 1;
                while(set.contains(num + len))
                {
                    len++;
                }

                best = Math.max(best, len);
            }
        }

        return best;
    }
}
