class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLength = 0;
        HashMap<Character, Integer> lastPlaceSeeAt = new HashMap<Character, Integer>();
        int l = 0;

        for(int r = 0; r < s.length(); r++)
        {
            char c = s.charAt(r);
            if(lastPlaceSeeAt.containsKey(c) && lastPlaceSeeAt.get(c) >= l)
            {
                l = lastPlaceSeeAt.get(c) + 1;
            }

            lastPlaceSeeAt.put(c, r);

            maxLength = Math.max(maxLength, r - l + 1);
        }
        
        return maxLength;
    }
}
