class Solution 
{
    public String encode(List<String> strs) 
    {
        StringBuilder s = new StringBuilder();

        for(int i = 0; i < strs.size(); i++)
        {
            s.append(strs.get(i));
            s.append("delim");
        }

        return s.toString();
    }

    public List<String> decode(String str) 
    {
        String[] arr = str.split("delim",-1);
        List<String> list = new ArrayList<>();

        for(String s : arr)
        {
            list.add(s);
        }

        list.remove(list.size()- 1);
        
        return list;
    }
}
