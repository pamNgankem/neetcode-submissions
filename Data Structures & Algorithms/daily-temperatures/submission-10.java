class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] days = new int[temperatures.length];

        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < temperatures.length; i++)
        {
            int t = temperatures[i];

            while(!stack.isEmpty() && t > temperatures[stack.peek()])
            {
                int prevDayIndex = stack.pop();
                days[prevDayIndex] = i - prevDayIndex;
            }

            stack.push(i);
        }

        return days;
    }
}
