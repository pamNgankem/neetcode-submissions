class Solution {
    public boolean isAnagram(String s, String t) 
    {
        /*
        if(s.length() != t.length())
        {
            return false;
        }

        char[] s1 = new char[s.length()];
        char[] t1 = new char[t.length()];

        for(int i = 0; i < s1.length; i++)
        {
            s1[i] = s.charAt(i);
        }

        for(int j = 0; j < t1.length; j++)
        {
            t1[j] = t.charAt(j);
        }

        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(s1,t1);
        */

        if(s.length() != t.length())
        {
            return false;
        }

        HashMap<Character, Integer> s1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> t1 = new HashMap<Character, Integer>();

        for(int i = 0; i < s.length(); i++)
        {
            char character = s.charAt(i);

            if(!s1.containsKey(character))
            {
                s1.put(character, 1);
            }
            else
            {
                s1.put(character, s1.get(character) + 1);
            }
        }

        for(int i = 0; i < t.length(); i++)
        {
            char character = t.charAt(i);
            
            if(!t1.containsKey(character))
            {
                t1.put(character, 1);
            }
            else
            {
                t1.put(character, t1.get(character) + 1);
            }
        }


        return s1.equals(t1);

    }
}
