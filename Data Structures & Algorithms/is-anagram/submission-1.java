class Solution {
    public boolean isAnagram(String s, String t) 
    {
        char[] s1 = new char[s.length()];
        char[] t1 = new char[t.length()];

        for(int i = 0; i < s1.length; i++)
        {
            s1[i] = s.charAt(i);
        }

        for(int j = 0; j < t1.length; j++)
        {
            t1[j] = t.charAt(j);
        }

        Arrays.sort(s1);
        Arrays.sort(t1);

        if(Arrays.equals(s1,t1))
        {
            return true;
        }

        return false;

    }
}
