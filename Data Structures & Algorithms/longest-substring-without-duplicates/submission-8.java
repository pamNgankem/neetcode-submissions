class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        // length of longest substring seen so far
        int maxLength = 0;

        // store the characters of a substring
        HashSet<Character> set = new HashSet<Character>();

        //boundaries of the substrings (start and end)
        int l = 0;

        //pottential substring starts
        for(int r = 0; r < s.length(); r++)
        {
            //shrink the window
            while(set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }

            //extend the sunstring
            set.add(s.charAt(r));

            //update maxLength if a longer substring is found
            maxLength = Math.max(maxLength, set.size());
        }

        return maxLength;
    }
}
