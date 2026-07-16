class Solution 
{
    public int minEatingSpeed(int[] piles, int h) 
    {

       // maximum number of bananas of a pile
       int maxBananas = 0;

       //iterating through the piles
       for(int i = 0; i < piles.length; i++)
       {
        maxBananas = Math.max(maxBananas, piles[i]);
       }

       // iterate over the different possible rates
       for(int j = 1; j <= maxBananas; j++)
       {
         //time to eat all the bananas from the pile
         double time = 0;

         for(int k = 0; k < piles.length; k++)
         {
            // number of bananas in pile kth is less than the rate
            if(piles[k] < j)
            {
                time++;
            }
            else
            {
                time += (Math.ceil(piles[k]/(double)j));
            }
         }

         // is the time wihtin h?
         if(time <= h)
         {
            return j;
         }
       }
     
        return 1;
    }
}
