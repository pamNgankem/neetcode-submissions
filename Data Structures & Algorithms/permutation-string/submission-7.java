class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {

        if(s1.length() > s2.length())
        {
            return false;
        }

        HashMap<Character,Integer> freqS1 = new HashMap<Character,Integer>();

        for(int i = 0; i < s1.length(); i++)
        {
            char c = s1.charAt(i);
            if(!freqS1.containsKey(c))
            {
                freqS1.put(c,1);
            }
            else
            {
                freqS1.put(c,freqS1.get(c)+1);
            }
        }

        int need = freqS1.size();

        for(int i = 0; i < s2.length(); i++)
        {
            HashMap<Character, Integer> freqSub = new HashMap<Character,Integer>();
            int curr = 0;
            

            for(int j = i; j < s2.length(); j++)
            {
                char c = s2.charAt(j);

                if(!freqSub.containsKey(c))
                {
                    freqSub.put(c,1);
                }
                else
                {
                    freqSub.put(c,freqSub.get(c)+1);
                }
                
                if(!freqS1.containsKey(c) || freqSub.get(c) > freqS1.get(c))
                {
                    break;
                }

                if(freqSub.get(c) == freqS1.get(c))
                {
                    curr++;
                }
                
                if(curr == need)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
}
