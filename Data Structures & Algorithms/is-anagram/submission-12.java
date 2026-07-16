class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        if(s.length() != t.length())
        {
            return false;
        }
        HashMap<Character, Integer> s1 = new HashMap<Character,Integer>();
        HashMap<Character, Integer> t1 = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length(); i++)
        {
            char cs = s.charAt(i);
            if(!s1.containsKey(cs))
            {
                s1.put(cs, 1);
            }
            else
            {
                s1.put(cs, s1.get(cs)+1);
            }

            char ct = t.charAt(i);
            if(!t1.containsKey(ct))
            {
                t1.put(ct, 1);
            }
            else
            {
                t1.put(ct, t1.get(ct)+1);
            }
        }

        return t1.equals(s1);

    }
}
