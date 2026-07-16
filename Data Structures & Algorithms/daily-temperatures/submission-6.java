class Solution 
{
    public int[] dailyTemperatures(int[] temperatures) 
    {
        int[] days = new int[temperatures.length];

        for(int i = 0; i < temperatures.length - 1; i++)
        {
            int count = 0;
            int j = i+1;
            boolean isThereOne = false;

            while(j < temperatures.length)
            {
                if(temperatures[j] <= temperatures[i])
                {
                    j++;
                }
                else
                {
                    isThereOne = true;
                    break;
                }

            }

            if(!isThereOne)
            {
                days[i] = 0;
            }
            else
            {
                days[i] = j - i;
            }
              
        }

        return days;
        
    }
}
