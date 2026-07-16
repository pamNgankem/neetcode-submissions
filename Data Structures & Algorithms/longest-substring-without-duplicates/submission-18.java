class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        HashMap<Character, Integer> lastSeenAt = new HashMap<Character, Integer>();
        int l = 0;
        int maxLength = 0;

        for(int r = 0; r < s.length(); r++)
        {
            char c = s.charAt(r);

            if(lastSeenAt.containsKey(c) && lastSeenAt.get(c) >= l)
            {
                l = lastSeenAt.get(c) + 1;
            }

            maxLength = Math.max(maxLength, r - l + 1);
            lastSeenAt.put(c, r);
        
        }
        
        return maxLength;
    }
}
