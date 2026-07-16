class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        if(s.length() < k)
        {
            return 0;
        }

        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        int maxFreq = 0;
        int l = 0;
        int maxLength = 0;

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if(!map.containsKey(c))
            {
                map.put(c, 1);
            }
            else
            {
                map.put(c, map.get(c) + 1);
            }
            maxFreq = Math.max(maxFreq, map.get(c));

            while( i - l + 1 - maxFreq > k)
            {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }

            maxLength = Math.max(maxLength, i - l + 1);
            
        }

        return maxLength;
    }
}
