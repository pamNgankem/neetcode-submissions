class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++)
        {
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            int maxFreq = 0;
            for(int j = i; j < s.length(); j++)
            {
                char c = s.charAt(j);
                if(!map.containsKey(c))
                {
                    map.put(c,1);
                }
                else
                {
                    map.put(c, map.get(c) + 1);
                }
                maxFreq = Math.max(maxFreq, map.get(c));

                if(j - i + 1 - maxFreq <= k)
                {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }
}
