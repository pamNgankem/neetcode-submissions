class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s2.length() < s1.length())
        {
            return false;
        }

        for(int i = 0; i <= s2.length() - s1.length(); i++)
        {
            String s = s2.substring(i, i + s1.length());
            HashMap<Character,Integer> frequency = new HashMap<Character, Integer>();
            HashMap<Character,Integer> frequency1 = new HashMap<Character, Integer>();
            int count = 0;

            for(int k = 0; k < s.length(); k++)
            {
                frequency.put(s.charAt(k), frequency.getOrDefault(s.charAt(k), 0) + 1);
                frequency1.put(s1.charAt(k), frequency1.getOrDefault(s1.charAt(k), 0) + 1);
            }

            if (frequency.equals(frequency1)) return true;
        }

        return false;
    }
}
