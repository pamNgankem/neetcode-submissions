class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        int maxLength = 0;

        int l = 0;
        HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
        int maxFreq = 0;

        for(int j = 0; j < s.length(); j++)
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

            while((j - l + 1) - maxFreq > k)
            {
               frequency.put(s.charAt(l), frequency.get(s.charAt(l)) - 1);
               l++; 
            }
            
            maxLength = Math.max(maxLength, (j - l + 1));
        }

        return maxLength;
    }
}
