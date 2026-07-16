class Solution 
{
    public int characterReplacement(String s, int k) 
    {
        // length of the longest substring without repeated charaters
        int longSubLength = 0;

        //looking for all the potential substring of the string
        for(int i = 0; i < s.length(); i++)
        {
            //frequencies of the charater apperaing the most in this substring
            int maxFreq = 0;

            // store the frequency of every character in the current substring
            HashMap<Character, Integer> frequencies = new HashMap<Character,Integer>();

            for(int j = i; j < s.length(); j++)
            {
                char c = s.charAt(j);
                // adding the characters of the substring with their frquencies in the hashmap
                if(!frequencies.containsKey(c))
                {
                    frequencies.put(c,1);// first occurence of c
                }
                else
                {
                    frequencies.put(c, frequencies.get(c)+1);// other occurence of c, update c's frequency
                }

                maxFreq = Math.max(maxFreq, frequencies.get(c));

                int replacements = (j - i + 1) - maxFreq;

                if(replacements <= k)
                {
                    longSubLength = Math.max(longSubLength, (j - i + 1));
                }
            }
        }

        return longSubLength;
    }
}
