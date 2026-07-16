class Solution 
{
    public boolean isPalindrome(String s) 
    {
        int l = 0;

        int r = s.length() - 1;

        while(l < r)
        {
            char lc = Character.toLowerCase(s.charAt(l));
            char rc = Character.toLowerCase(s.charAt(r));
            if(Character.isLetterOrDigit(lc))
            {
                if(Character.isLetterOrDigit(rc))
                {
                    if(lc != rc)
                    {
                        return false;
                    }

                    l++;
                    r--;
                }
                else
                {
                    r--;
                }
            }
            else
            {
                l++;
            }
        }

        return true;
    }
}
