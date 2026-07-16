class Solution 
{
    public String minWindow(String s, String t) 
    {
        if (t.length() > s.length()) 
        {
            return "";
        }

        HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();

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

        String minString = "";
        int minStringLength = Integer.MAX_VALUE;   // ✅ key fix

        for (int i = 0; i < s.length(); i++) 
        {
            for (int j = i; j < s.length(); j++) 
            {
                String sub = s.substring(i,j+1);

                if(sub.length() < t.length())
                {
                    continue;
                }

                HashMap<Character,Integer> subMap = new HashMap<Character,Integer>();

                for(int k = 0; k < sub.length(); k++)
                {
                    char c = sub.charAt(k);
                    if(!subMap.containsKey(c))
                    {
                        subMap.put(c,1);
                    }
                    else
                    {
                        subMap.put(c, subMap.get(c) + 1);
                    }

                }

                boolean valid = true;
                for (var entry : tMap.entrySet()) 
                {
                    char key = entry.getKey();
                    int need = entry.getValue();
                    if (subMap.getOrDefault(key, 0) < need) 
                    {
                        valid = false;
                        break;
                    }
                }

                // ✅ only update if substring is valid
                if (valid && sub.length() < minStringLength) 
                {
                    minString = sub;
                    minStringLength = sub.length();
                }
            }
        }

        return minString;
        
    }
}
