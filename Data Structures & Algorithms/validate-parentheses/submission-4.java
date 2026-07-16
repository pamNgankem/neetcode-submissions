class Solution 
{
    public boolean isValid(String s) 
    {
        if(s.length() < 1 || s.length() % 2 != 0)
        {
            return false;
        }

        // store the opening parentheses seen so far
        Stack<Character> openings = new Stack<Character>();

        // start comparing parentheses
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            
            // we have an opening parenthesis
            if(isOpening(ch))
            {
                openings.push(ch); // add it on top of the stack
            }
            else if (isClosing(ch)) // the parenthesis is a closing one
            {
                //if the stack is empty, then there is no openingf parenthesis and the pair is not valid
                if(openings.size() == 0)
                {
                    return false;
                }

                // the parentheses are not matching, s is invalid
                if(!isMatching(openings.peek(), ch))
                {
                    return false;
                }
                else //there are matching
                {
                    openings.pop(); //remove the corresponding opening parenthjesis matching the closing parenthesis ch since we processed it
                }
            }
        }

        if(!openings.isEmpty())
        {
            return false;
        }
        else
        {
            return true;
        }
        
    }

    // checking for opening parentheses
    public boolean isOpening(char c)
    {
        return (c == '(' || c == '{' || c == '[' );
        
    }

    // checking for closing parentheses
    public boolean isClosing(char c)
    {
        return (c == ')' || c == '}' || c == ']' );
        
    }

    // checking if a pair matches
    public boolean isMatching(char opening, char closing)
    {
        return ( ( opening ==  '(') && ( closing ==  ')') || ( opening ==  '{') && ( closing ==  '}') || ( opening ==  '[') && ( closing ==  ']'));
    }
}
