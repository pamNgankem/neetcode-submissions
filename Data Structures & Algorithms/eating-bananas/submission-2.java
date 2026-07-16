class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {

        int largestPile = piles[0];
        //int min = Integer.MAX_VALUE;

        for(int i = 1; i < piles.length; i++)
        {
            largestPile = Math.max(largestPile, piles[i]);
        }

        for(int i = 1; i <= largestPile; i++)
        {
            double time = 0;
            for(int j = 0; j < piles.length; j++)
            {
                if(piles[j] < i)
                {
                    time++;
                }
                else
                {
                    time = time + Math.ceil((piles[j] / (double)i));
                }
            }

            if(time <= h)
            {
                return i;
            }
        }

        return 1;

        
    }
}
