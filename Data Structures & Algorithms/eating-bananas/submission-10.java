class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {
      int max = piles[0];

      for(int i = 1; i < piles.length; i++)
      {
        max = Math.max(max, piles[i]);
      }

      for(int i = 1; i <= max; i++)
      {
        double hours = 0;
        for(int j = 0; j < piles.length; j++)
        {
            if(piles[j] > i)
            {
                hours += Math.ceil(piles[j] / (double)i);
            }
            else
            {
                hours++;
            }
        }

        if(hours <= h)
        {
            return i;
        }
      }

      return 1;
    }
}
