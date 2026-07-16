class Solution 
{
    public int evalRPN(String[] tokens) 
    {
        Stack<Integer> stack = new Stack<Integer>();
        String s = "+-*/";

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

                switch(tokens[i])
                {
                    case "+":
                        stack.push(operand1 + operand2);
                        break;
                    case "-":
                        stack.push(operand1 - operand2);
                        break;
                    case "*":
                        stack.push(operand1 * operand2);
                        break;
                    case "/":
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }

        return stack.peek();
    }
}
