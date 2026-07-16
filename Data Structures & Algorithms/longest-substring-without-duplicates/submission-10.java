class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++)
        {
            HashSet<Character> str = new HashSet<Character>();

            for(int j = i; j < s.length(); j++)
            {
                char c = s.charAt(j);
                if(str.contains(c))
                {
                    break;
                }

                str.add(c);
            }

            maxLength = Math.max(maxLength, str.size());
        }

        return maxLength;
    }
}
