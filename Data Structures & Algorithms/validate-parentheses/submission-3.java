class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> openings = new Stack<Character>();

        
        if(s.length() <= 1)
        {
            return false;
        }
        

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if(isOpening(c))
            {
                openings.push(c);
            }
            else if (isClosing(c))
            {
                if(openings.size() == 0)
                {
                    return false;
                }
                if(!matches(openings.peek(), c))
                {
                    return false;
                }
                else
                {
                    openings.pop();
                }
            }
        }

        if(openings.size() != 0)
        {
            return false;
        }
        else
        {
            return true;
        }
    }

    public boolean isOpening(char chr)
    {
        return (chr == '(' || chr == '{' || chr == '[');
    }

    public boolean isClosing(char chr)
    {
        return (chr == ')' || chr == '}' || chr == ']');
    }

    public boolean matches(char chr1, char chr2)
    {
        return (chr1 == '(' && chr2 == ')') || (chr1 == '{' && chr2 == '}') || (chr1 == '[' && chr2 == ']');
    }
}
