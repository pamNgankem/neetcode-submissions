class Solution 
{
    public boolean isAnagram(String s, String t) 
    {
        //stores s's charcters with their repective occurrences
        HashMap<Character,Integer> mapS = new HashMap<Character,Integer>();

        //stores s's charcters with their repective occurrences
        HashMap<Character,Integer> mapt = new HashMap<Character,Integer>();

        //storing s's charaters and occurences
        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if(!mapS.containsKey(c))
            {
                mapS.put(c,1);
            }
            else
            {
                mapS.put(c,mapS.get(c)+1);
            }
        }

        //storing t's charaters and occurences
        for(int i = 0; i < t.length(); i++)
        {
            char c = t.charAt(i);
            if(!mapt.containsKey(c))
            {
                mapt.put(c,1);
            }
            else
            {
                mapt.put(c,mapt.get(c)+1);
            }
        }

        return mapS.equals(mapt);

    }
}
