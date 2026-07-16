class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(int i = 0; i < strs.length; i++)
        {
            char[] characters = strs[i].toCharArray();
            Arrays.sort(characters);

            // Convert back to string
            String sorted = new String(characters);

            if(!map.containsKey(sorted))
            {
                map.put(sorted, new ArrayList<String>(Arrays.asList(strs[i])));
            }
            else
            {
                ArrayList<String> list2 = map.get(sorted);
                list2.add(strs[i]);
                map.put(sorted, list2);
            }
        }

        List<List<String>> list = new ArrayList<>();
        
        for(String key : map.keySet())
        {
            list.add(map.get(key));
        }
        
        return list;
    }
}
