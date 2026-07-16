class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s1.length() > s2.length())
        {
            return false;
        }

        if(matching(s1, s2.substring(0, s1.length())))
        {
            return true;
        }

        for(int i = s1.length(); i < s2.length(); i++)
        {
            if(matching(s1, s2.substring(i - s1.length() + 1, i + 1)))
            {
                return true;
            }
        }

        return false;
    }

    public boolean matching(String s1, String s2)
    {
        HashMap<Character, Integer> mapS = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapS2  = new HashMap<Character, Integer>();

        for(int i = 0; i < s1.length(); i++)
        {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if(!mapS.containsKey(c1))
            {
                mapS.put(c1, 1);
            }
            else{
                mapS.put(c1, mapS.get(c1)+1);
            }
            
            if(!mapS2.containsKey(c2))
            {
                mapS2.put(c2, 1);
            }
            else{
                mapS2.put(c2, mapS2.get(c2)+1);
            }
        }

        return mapS.equals(mapS2);
    }
}
