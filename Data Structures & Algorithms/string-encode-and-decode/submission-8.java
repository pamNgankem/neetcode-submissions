class Solution 
{

    public String encode(List<String> strs) 
    {
        StringBuilder sb = new StringBuilder();

        for(String s : strs)
        {
            sb.append(s).append("delim");
        }

        return sb.toString().trim();
    }

    public List<String> decode(String str) 
    {
        str.trim();
        String[] s = str.split("delim",-1);

        List<String> list = new ArrayList<String>();

        for(int i = 0; i < s.length; i++)
        {
            list.add(s[i]);
        }

        list.remove(list.size() -1);
        return list;
    }
}
