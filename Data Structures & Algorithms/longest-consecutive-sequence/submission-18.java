class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        //stores the numbers of nums
        HashSet<Integer> set = new HashSet<Integer>();

        // add nums' elements to set
        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }

        //longest consecutive sequence length
        int longest = 0;

        // considering only valid start of sequences
        for(int num : set)
        {
            // this is a valid start
            if(!set.contains(num - 1))
            {
                // length of this sequence
                int len = 1;

                //keep expanding the set as long as I still get consecutive elements
                while(set.contains(num+len))
                {
                    len++;
                }

                //update the longest length if the current one is bigger
                longest = Math.max(longest, len);
            }
        }

        return longest;
    }
}
