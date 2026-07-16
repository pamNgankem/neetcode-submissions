class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int maxLength = 0;

        for(int r = 0 ; r < s.length(); r++)
        {
            HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
            int maxFreq = 0;

            for(int j = r; j < s.length(); j++)
            {
                char c = s.charAt(j);
                if(!frequency.containsKey(c))
                {
                    frequency.put(c, 1);
                }
                else
                {
                    frequency.put(c, frequency.get(c) + 1);
                }

                maxFreq = Math.max(maxFreq, frequency.get(c));

                if((j - r + 1) - maxFreq <= k)
                {
                    maxLength = Math.max(maxLength, (j - r + 1));
                }
            }
        }
        return maxLength;
    }
}
