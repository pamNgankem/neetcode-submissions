class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int lengthOfLongStr = 0;

        for(int i = 0; i < s.length(); i++)
        {
            HashMap<Character,Integer> freq = new HashMap<Character,Integer>();

            int maxFreq = 0;

            for(int j = i; j < s.length(); j++)
            {
                char c = s.charAt(j);

                if(!freq.containsKey(c))
                {
                    freq.put(c,1);
                }
                else
                {
                    freq.put(c,freq.get(c)+1);
                }

                maxFreq = Math.max(maxFreq, freq.get(c));

                int replacements = (j - i + 1) - maxFreq;

                if(replacements <= k)
                {
                    lengthOfLongStr = Math.max(lengthOfLongStr, j - i + 1);

                }
            }
        }

        return lengthOfLongStr;
    }
}
