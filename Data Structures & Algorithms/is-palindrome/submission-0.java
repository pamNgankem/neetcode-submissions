class Solution 
{
    public boolean isPalindrome(String s) 
    {
        s.trim();
        //String[] arr1 = s.split("\s+");
        StringBuilder s1 = new StringBuilder();

        for(int i = 0; i < s.length(); i++)
        {
            char character = s.charAt(i);
            if(Character.isDigit(character) || Character.isLetter(character))
            {
                s1.append(character);
            }
        }
        String s2 = s1.toString();

        StringBuilder s3 = new StringBuilder();
        for(int i = s2.length() - 1; i >= 0 ; i--)
        {
            char character = s2.charAt(i);

            s3.append(character);
        }

        String s4 = s3.toString();

        return s2.equalsIgnoreCase(s4);
    }
}
