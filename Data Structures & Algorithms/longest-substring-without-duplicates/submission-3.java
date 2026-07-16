class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        if(s == null || s.length() == 0)
        {
            return 0;
        }

        if(s.length() == 1)
        {
            return 1;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < s.length() - 1; i++)
        {
            HashSet<Character> set = new HashSet<Character>();
            set.add(s.charAt(i));
            list.add(1);
            for(int j = i + 1; j < s.length(); j++)
            {
                char c = s.charAt(j);
                if(!set.contains(c))
                {
                    set.add(c);
                    list.add((s.substring(i,j+1)).length());
                }
                else
                {
                    break;
                }
            }
        }

        int maxLength = list.get(0);

        for(int i = 1; i < list.size(); i++)
        {
            maxLength = Math.max(maxLength,list.get(i));
        }

        return maxLength;
    }
}
