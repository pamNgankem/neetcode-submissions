class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> openings = new Stack<Character>();

        for(int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if(isOpening(c))
            {
                openings.push(c);
            }
            else if (isClosing(c))
            {
                if(openings.isEmpty())
                {
                    return false;
                }
                
                if(!matching(openings.peek(), c))
                {
                    return false;
                }

                openings.pop();
            }
        }

        return openings.isEmpty();
    }

    public boolean isOpening(char c)
    {
        return c == '(' || c == '{' || c == '[';
    }

    public boolean isClosing(char c)
    {
        return c == ')' || c == '}' || c == ']';
    }

    public boolean matching(char c, char t)
    {
        return (c == '(' && t == ')') || ( c == '{' && t == '}') || (c == '[' && t == ']');
    }
}
