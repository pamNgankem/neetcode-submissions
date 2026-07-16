class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int numZeros = 0;
        int product = 1;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                numZeros++;
            }
            else
            {
                product *= nums[i];
            } 
        }

        if(numZeros > 1)
        {
            return new int[nums.length];
        }

        int[] products = new int[nums.length];

        for(int j = 0; j < nums.length; j++)
        {
            if(numZeros > 0)
            {
                if(nums[j] == 0)
                {
                    products[j] = product;
                }
                else
                {
                    products[j] = 0;
                }
            }
            else
            {
                products[j] = product / nums[j];
            }
        }

        return products;
        
    }
}  
