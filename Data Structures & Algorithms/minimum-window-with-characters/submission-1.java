class Solution 
{
    public String minWindow(String s, String t) 
    {
        if(s.length() < t.length())
        {
            return "";
        }

        int[] need = new int[128];
        for (int i = 0; i < t.length(); i++) 
        {
            need[t.charAt(i)]++;
        }

        int minLength = 0;
        String str = "";

        for(int i = 0; i < s.length(); i++)
        {
            for(int j = i; j < s.length(); j++)
            {
                String s1 = s.substring(i, j+1);
                if(s1.length() < t.length())
                {
                    continue;
                }

                int[] have = new int[128];
                for (int k = 0; k < s1.length(); k++) 
                {
                    have[s1.charAt(k)]++;
                }

                boolean ok = true;
                for (int c = 0; c < 128; c++) 
                {
                    if (have[c] < need[c]) 
                    {
                        ok = false;
                        break;
                    }
                }

                if(ok)
                {
                    if (minLength == 0 || s1.length() < minLength)
                    {
                        minLength = s1.length();
                        str = s1;
                    }
                }
            }
        }

        return str;
    }
}
