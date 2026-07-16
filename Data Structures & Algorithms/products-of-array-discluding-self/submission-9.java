class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
    
        // product of nums'elements
        int product = 1;
        int zeroCount = 0;

        //compute the product
        for(int i = 0; i < nums.length; i++)
        {
            //exclude zeros from my product
            if(nums[i] != 0)
            {
                product *= nums[i];
            }
            else
            {
                zeroCount++; // increment number of zeros
            }
        }

        // we have multiple zeros, all products will be zeros
        if(zeroCount > 1)
        {
            return new int[nums.length];
        }

        // products storage
        int[] products = new int[nums.length];

        // compute the different products
        for(int i = 0; i < nums.length; i++)
        {
            if(zeroCount > 0)
            {
                if(nums[i] == 0)
                {
                    products[i] = product;
                }
                else
                {
                    products[i] = 0;
                }
            }
            else
            {
                products[i] = product / nums[i];
            }
        }

        return products;
        
    }
}  
