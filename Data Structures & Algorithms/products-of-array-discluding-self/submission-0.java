class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        if(nums.length == 0)
        {
            return nums;
        }

        int[] arr = new int[nums.length];
        int product;
        for(int i = 0; i < nums.length; i++)
        {
            product = 1;
            for(int j = 0; j < nums.length; j++)
            {
                if(j != i)
                {
                    product *= nums[j];
                }
            }

            arr[i] = product;
        }

        return arr;
    }
}  
