class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] numDays = new int[temperatures.length];

        for(int i = 0; i < temperatures.length - 1; i++)
        {
            int j = i + 1;
            boolean isThereOne = false;

            while(j < temperatures.length)
            {
                if(temperatures[j] <=  temperatures[i])
                {
                    j++;
                }
                else
                {
                    isThereOne = true;
                    break;
                }
                
            }

            if(isThereOne)
            {
                numDays[i] = (j - i);
            }
            else
            {
                numDays[i] = 0;
            }
        }

        return numDays;
    }
}
