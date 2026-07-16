class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        for(int i = 0; i < strs.length; i++)
        {
            char[] s = strs[i].toCharArray();
            Arrays.sort(s);
            String s1 = new String(s);
            //ArrayList<String> list = new ArrayList<String>();

            if(!map.containsKey(s1))
            {
                ArrayList<String> list = new ArrayList<String>();
                list.add(strs[i]);
                map.put(s1, list);

            }
            else
            {
                (map.get(s1)).add(strs[i]);
            }
        }

        return new ArrayList<>(map.values());

        /*
        map = {}

        "act", not in the list, {("act": ["act"])}
        "pots", not in the list {("act": ["act"]), ("pots": ["pots"])}
        "tops", is the list {("act": ["act"]), ("pots": ["pots", "tops"])}
        "cats", is the list {("act": ["act", "cats"]), ("pots": ["pots", "tops"])}
        "stop", is the list {("act": ["act", "cats"]), ("pots": ["pots", "tops", "opts"])}
        "stop", is not in the list {("act": ["act", "cats"]), ("pots": ["pots", "tops", "opts"]), ("hat":["hat"])}
        return te values of the hashmap as a list
        */

    }
}
