class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int product = 1;
        int zeroCount = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                product *= nums[i];
            }
            else
            {
                zeroCount++;
            }
        }

        

        if(zeroCount > 1)
        {
            return new int[nums.length];
        }

        int[] products = new int[nums.length];

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
