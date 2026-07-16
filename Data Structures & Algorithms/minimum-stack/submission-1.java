class MinStack 
{
    Stack<Integer> stack;
    Stack<Integer> minStack;
    //int count = 0;

    public MinStack() 
    {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }
    
    public void push(int val) 
    {
        stack.push(val);
        if(minStack.isEmpty())
        {
            minStack.push(val);
        }
        else
        {
            minStack.push(Math.min(val, minStack.peek()));
        }

        //count++;
    }
    
    public void pop() 
    {
        stack.pop();
        minStack.pop();
        //count--;
    }
    
    public int top() 
    {
        return stack.peek();
    }
    
    public int getMin() 
    {
        return minStack.peek();
    }
}
