class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        
        // length of the longest substgring seen so far
        int maxLength = 0;

        //looking for start of potential substrings
        for(int i = 0; i < s.length(); i++)
        {
            //store all the characters of the substring that start with the character of s at position i
            HashSet<Character> set = new HashSet<Character>();

            //extending that string until a repeating character is found
            for(int j = i; j < s.length(); j++)
            {
                //it is not a repeating character
                if(set.contains(s.charAt(j)))
                {
                    break;
                }

                set.add(s.charAt(j));
            }

            //update the length of the longest substring seen so far if we found a longer one
            maxLength = Math.max(maxLength, set.size());

            
        }

        return maxLength;

    }
}
