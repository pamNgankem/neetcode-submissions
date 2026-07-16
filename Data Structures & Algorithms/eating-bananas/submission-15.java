class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int rate = 1;
        while(true)
        {
            long hours = 0;
            for(int j = 0; j < piles.length; j++)
            {
                hours += (int)Math.ceil((double)piles[j] / rate);
            }

            if(hours <= h)
            {
                return rate;
            }

            rate++;
        }
    }
}
