class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
        int max = piles[0];

        for(int i = 1; i < piles.length; i++)
        {
            max = Math.max(max, piles[i]);
        }
        
        int l = 1;
        int r = max;
        int res = max;

        while(l <= r)
        {
            int rate = l + (r - l) / 2;

            double hours = 0;
            for(int j = 0; j < piles.length; j++)
            {
                hours += Math.ceil(piles[j] / (double)rate);
            }

            if(hours <= h)
            {
                res = rate;
                r = rate - 1;

            }
            else
            {
                l = rate + 1;
            }
        }

        return res;
    }
}
