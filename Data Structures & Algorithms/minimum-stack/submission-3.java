class MinStack 
{
    int[] stack;
    int count = 0;

    public MinStack() 
    {
        stack = new int[1];
    }
    
    public void push(int val) 
    {
        if(count == stack.length)
        {
            int[] arr = new int[2 * stack.length];

            for(int i = 0; i < count; i++)
            {
                arr[i] = stack[i];
            }

            stack = arr;
        }

        stack[count] = val;
        count++;
    }
    
    public void pop() 
    {
        count--;
    }
    
    public int top() 
    {
        return stack[count - 1];
    }
    
    public int getMin() 
    {
        int min = stack[0];

        for(int i = 1; i < count; i++)
        {
            min  = Math.min(min, stack[i]);
        }

        return min;
    }
}
