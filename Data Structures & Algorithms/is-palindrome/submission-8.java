class Solution 
{
    /*
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
    */

    public boolean isPalindrome(String s) 
    {
        //remove extra spaces
        s.trim();

        // keep track of the left side of s
        int left = 0;
        
        //keeps track of the right side of the string
        int right = s.length() - 1;

        //checking the characters at both left and right against each other
        while(left < right)
        {
            char leftChar = Character.toLowerCase(s.charAt(left));
            char rightChar = Character.toLowerCase(s.charAt(right));
            if(Character.isLetterOrDigit(leftChar))
            {
                if(Character.isLetterOrDigit(rightChar))
                {
                    if(leftChar == rightChar)
                    {
                        left++;
                        right--;
                    }
                    else
                    {
                        return false;
                    }
                }
                else
                {
                    right--;
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















