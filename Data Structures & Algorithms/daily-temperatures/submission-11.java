class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {

        int[] num = new int[temperatures.length];

        for(int i = 0; i < temperatures.length - 1; i++)
        {
            int c = 1;
            int idx = i + 1;

            while(idx < temperatures.length && temperatures[idx] <= temperatures[i])
            {
                idx++;
                c++;
            }

            if(c != (temperatures.length - i))
            {
                num[i] = c;
            }
            else
            {
                num[i] = 0;
            }
        }

        return num;
    }
}
