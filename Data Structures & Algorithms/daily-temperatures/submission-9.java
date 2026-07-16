class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] result = new int[temperatures.length];

        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0; i < temperatures.length; i++)
        {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevDay = stack.pop();
                result[prevDay] = i - prevDay; // how many days it took to find a warmer temp
            }

            stack.push(i);
        }

        return result;
    }
}
