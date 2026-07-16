class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(t.length() != s.length())
        {
            return false;
        }

        char[] frequencies = new char[26];

        for(int i = 0; i < s.length(); i++)
        {
            frequencies[s.charAt(i) - 'a']++;
            frequencies[t.charAt(i) - 'a']--;
        }

        for(int freq : frequencies)
        {
            if( freq != 0)
            {
                return false;
            }
        }

        return true;
    }
}
