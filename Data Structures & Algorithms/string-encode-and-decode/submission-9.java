class Solution 
{

    public String encode(List<String> strs) 
    {
        StringBuilder sb = new StringBuilder();

        for(String s : strs)
        {
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();        
    }

    public List<String> decode(String str) 
    {
        List<String> list = new ArrayList<String>();

        int i = 0;

        while(i < str.length())
        {
            int j = i;

            while(str.charAt(j) != '#')
            {
                j++;
            }
            list.add(str.substring(j+1, j+1+Integer.parseInt(str.substring(i,j))));
            i = j+1+Integer.parseInt(str.substring(i,j));
        }

        return list;
    }
}
