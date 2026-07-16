class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLength = 0;
        int l = 0;
        int r = 0;

        HashSet<Character> set = new HashSet<Character>();

        while(r < s.length())
        {
            char c = s.charAt(r);

            while(set.contains(c))
            {
                set.remove(s.charAt(l));
                l++;
            }

            set.add(c);
            maxLength = Math.max(maxLength, r - l + 1);
            r++;
        }

        return maxLength;
    }
}
