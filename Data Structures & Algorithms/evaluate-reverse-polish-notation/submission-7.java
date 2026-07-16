class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<Integer>();

        if(tokens.length == 1)
        {
            return Integer.parseInt(tokens[0]);
        }
        String s = "+-*/";
        int result = 0;

        for(int i = 0; i < tokens.length; i++)
        {
            if(s.indexOf(tokens[i]) == -1)
            {
                stack.push(Integer.parseInt(tokens[i]));
            }
            else
            {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                String operator = tokens[i];

                if(operator.equals("+"))
                {
                    result = operand1 + operand2;
                }
                else if(operator.equals("-"))
                {
                    result = operand1 - operand2;
                }
                else if(operator.equals("*"))
                {
                    result = operand1 * operand2;
                }
                else if(operator.equals("/"))
                {
                    result = operand1 / operand2;
                }

                stack.push(result);
            }
        }
        
        return result;
    }
}
