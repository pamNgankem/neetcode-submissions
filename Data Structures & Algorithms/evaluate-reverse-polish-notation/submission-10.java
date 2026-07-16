class Solution 
{
    public int evalRPN(String[] tokens) 
    {

        String operators = "+-*/";

        Stack<Integer> operands = new Stack<Integer>();

        for(int i = 0; i < tokens.length; i++)
        {
            String s = tokens[i];

            if(operators.indexOf(s) == -1)
            {
                operands.push(Integer.parseInt(s));
            }
            else
            {
                int operand2 = operands.pop();
                int operand1 = operands.pop();
                if( s.equals("+"))
                {
                    operands.push(operand1 + operand2);
                }
                else if( s.equals("-"))
                {
                    operands.push(operand1 - operand2);
                }
                else if( s.equals("*"))
                {
                    operands.push(operand1 * operand2);
                }
                else
                {
                    operands.push(operand1 / operand2);
                }
            }
        }

        return operands.pop();
    }
}
