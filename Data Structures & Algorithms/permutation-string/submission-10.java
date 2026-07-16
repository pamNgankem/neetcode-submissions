class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        s1 = new String(s1Arr);
        for(int i = 0; i < s2.length(); i++)
        {
            for(int j = i; j < s2.length(); j++)
            {
                char[] s2Arr = (s2.substring(i,j+1)).toCharArray();
                Arrays.sort(s2Arr);
                String s3 = new String(s2Arr);
                if(s1.equals(s3)){
                    return true;
                }
            }
        }

        return false;
    }
}
