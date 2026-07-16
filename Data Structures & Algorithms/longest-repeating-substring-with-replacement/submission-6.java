class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        HashMap<Character,Integer> freq = new HashMap<Character,Integer>();

        int l = 0;
        int lengthOfLongStr = 0;

        int maxFreq = 0;

        for(int j =  0; j < s.length(); j++)
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

            while((j - l + 1) - maxFreq > k)
            {
                freq.put(s.charAt(l), freq.get(s.charAt(l)) - 1);
                l++;
            }

            lengthOfLongStr = Math.max(lengthOfLongStr, j - l + 1);
        }

        return lengthOfLongStr;
    }
}
