class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(int i = 0; i < strs.length; i++)
        {
            int[] count = new int[26];
            //char[] s = strs[i].toCharArray();

            for(char s : strs[i].toCharArray())
            {
                count[s - 'a']++;
            }
            //Arrays.sort(s);
            String s1 = Arrays.toString(count);
            //ArrayList<String> list = new ArrayList<String>();

            if(!map.containsKey(s1))
            {
                map.put(s1, new ArrayList<String>(Arrays.asList(strs[i])));

            }
            else
            {
                (map.get(s1)).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());
    }
}
