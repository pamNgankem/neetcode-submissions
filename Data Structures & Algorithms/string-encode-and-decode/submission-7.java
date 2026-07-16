class Solution 
{

    public String encode(List<String> strs) 
    {
        StringBuilder sb = new StringBuilder();
        
        for(String s : strs)
        {
            sb.append(s).append("delim");
        }

        return sb.toString();
    }

    public List<String> decode(String str) 
    {
        String[] strs = str.split("delim",-1);

        List<String> list = new ArrayList<>();

        for(String s : strs)
        {
            list.add(s);
        }
        list.remove(list.size() -1);
        return list;
    }
}
