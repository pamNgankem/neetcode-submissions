class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
        {
            return nums.length;
        }
        // convert nums into a set to remove duplicate elements
        HashSet<Integer> set = new HashSet<Integer>();

        //store nums'elements into the set
        for(int num : nums)
        {
            set.add(num);
        }

        // longest consecutive sequence length
        int maxLength = 0;

        // computing different sequences' length
        for(int num : set)
        {
            // is num a valid start?

            if(!set.contains(num - 1))
            {
                // length of the sequence starting at num
                int length = 1;

                while(set.contains(num + length))
                {
                    length++;
                }

                // comapre it to maximum length
                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;

    }
}
