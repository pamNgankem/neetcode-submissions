class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s.trim();
        
        //stores only the alphanumerical characters of s
        StringBuilder sb = new StringBuilder();


        //only adding the alphanumerical characters to sb
        for(int i = 0; i < s.length(); i++)
        {
            //character at postion i in s
            char c = s.charAt(i);

            if(Character.isLetterOrDigit(c))
            {
                sb.append(Character.toLowerCase(c));
            }
        }

        return (sb.toString()).equals(sb.reverse().toString());
    }
}
