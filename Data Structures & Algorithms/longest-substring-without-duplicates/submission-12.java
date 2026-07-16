class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++)
        {
            HashSet<Character> set = new HashSet<Character>();

            for(int j = i; j < s.length(); j++)
            {
                char c = s.charAt(j);
                if(set.contains(c))
                {
                    break;
                }

                set.add(c);
            }

            maxLength = Math.max(maxLength, set.size());
        }

        return maxLength;
    }
}
