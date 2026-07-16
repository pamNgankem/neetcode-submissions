class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        if(s.length() == 0)
        {
            return 0;
        }
        int maxLength = 0;

        
        for(int l = 0; l < s.length(); l++)
        {
            for(int r = l ; r < s.length(); r++)
            {
                String s1 = s.substring(l, r + 1);
                HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();

                int maxFreq = 0;
                for(int j = 0; j < s1.length(); j++)
                {
                    char c = s1.charAt(j);
                    if(!frequency.containsKey(c))
                    {
                        frequency.put(c, 1);
                    }
                    else
                    {
                        frequency.put(c, frequency.get(c) + 1);
                    }

                    if(frequency.get(c) > maxFreq)
                    {
                        maxFreq = frequency.get(c);
                    }
                }

                if(s1.length() - maxFreq <= k)
                {
                    maxLength = Math.max(maxLength, s1.length());
                }
            }
        }
        return maxLength;
    }
}
