class Solution 
{
    public String minWindow(String s, String t) 
    {
        if(t.length() > s.length())
        {
            return "";
        }
        
        HashMap<Character, Integer> tMap = new HashMap<Character, Integer>();

        for(int i = 0; i < t.length(); i++)
        {
            char c = t.charAt(i);
            if(!tMap.containsKey(c))
            {
                tMap.put(c,1);
            }
            else
            {
                tMap.put(c, tMap.get(c) + 1);
            }
        }

        int minLength = Integer.MAX_VALUE;
        String shortest = "";

        for(int i = 0; i < s.length(); i++)
        {
            for(int j = i; j < s.length(); j++)
            {
                if(j - i + 1 < t.length())
                {
                    continue;
                }
                
                HashMap<Character,Integer> subMap = new HashMap<Character, Integer>();

                for(int k = i; k <= j; k++)
                {
                    char c = s.charAt(k);
                    if(!subMap.containsKey(c))
                    {
                        subMap.put(c,1);
                    }
                    else
                    {
                        subMap.put(c, subMap.get(c) + 1);
                    }
                }
                boolean isIt = true;
                for(char c : t.toCharArray())
                {
                    if(!subMap.containsKey(c) || subMap.get(c) < tMap.get(c))
                    {
                        isIt = false;
                        break;
                    }
                }

                if(isIt)
                {
                    if((j - i + 1) < minLength && (j-i+1) >= t.length())
                    {
                        minLength = j - i + 1;
                        shortest = s.substring(i, j+1);
                    }
                }
            }
        }

        return shortest;
    }
}
