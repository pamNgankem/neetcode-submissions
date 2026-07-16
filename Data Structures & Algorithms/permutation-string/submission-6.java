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
                String sub = s2.substring(i, j+1);

                char[] subChar = sub.toCharArray();
                Arrays.sort(subChar);
                String subSorted = new String(subChar);

                if(s1Sorted.equals(subSorted))
                {
                    return true;
                }

            }
        }
        
        return false;
    }
}
