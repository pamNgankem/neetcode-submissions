class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] days = new int[temperatures.length];

        Stack<Integer> indices = new Stack<Integer>();

        for(int i = 0; i < temperatures.length; i++)
        {
            int temp = temperatures[i];

            while(!indices.isEmpty() && temp > temperatures[indices.peek()])
            {
                int prevDayIndex = indices.pop();
                days[prevDayIndex] = i - prevDayIndex;
            }

           indices.push(i);
        }

        return days;
    }
}
