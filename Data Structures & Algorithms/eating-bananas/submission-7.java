class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        Arrays.sort(piles);

        //[1,2,3,4] = 
        int left = 1;
        int right = piles[piles.length - 1];
        int min = right;

        while(left <= right)
        {
            int rate = left + (right - left)/2;

            double time = 0;
            for(int j = 0; j < piles.length; j++)
            {
                time += Math.ceil(piles[j]/(double)rate);
                /*
                if(piles[j] < rate)
                {
                    time++;
                }
                else
                {
                    time += (piles[j]/Math.ceil((double)rate));
                }
                */
            }

            if(time <= h)
            {
                min = rate;
                right = rate - 1; 
            }
            else
            {
                left = rate + 1;
            }
        }

        return min;
    }
}
