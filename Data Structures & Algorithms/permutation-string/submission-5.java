class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s1.length() > s2.length())
        {
            return false;
        }

        char[] s1Char = s1.toCharArray();
        Arrays.sort(s1Char);
        String s1Sorted = new String(s1Char);

        for(int i = 0; i < s2.length(); i++)
        {
            for(int j = i; j < s2.length(); j++)
            {
                String substring = s2.substring(i, j+1);
                char[] substringChar = substring.toCharArray();

                Arrays.sort(substringChar);
                String substringSorted = new String(substringChar);

                if(s1Sorted.equalsIgnoreCase(substringSorted))
                {
                    return true;
                }
            }
        }

        return false;

    }
}
