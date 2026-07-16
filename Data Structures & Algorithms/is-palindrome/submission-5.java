class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s.trim();
        int left = 0;
        int right = s.length() - 1;

        while(left < right)
        {
            if(Character.isLetterOrDigit(s.charAt(left)))
            {
                if(!Character.isLetterOrDigit(s.charAt(right)))
                {
                    right--;
                }
                else
                {
                    if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right)))
                    {
                        left++;
                        right--;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            else
            {
                left++;
            }
        }

        return true;
        
    }
}















