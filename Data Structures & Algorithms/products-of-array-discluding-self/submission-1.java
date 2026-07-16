class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        if(nums.length == 0)
        {
            return nums;
        }

        int[] arr = new int[nums.length];
        int product1;
        int product2;

        for(int i = 0; i < nums.length; i++)
        {
            product1 = 1;
            product2 = 1;
            for(int j = 0; j < i; j++)
            {
                product1 *= nums[j];
            }

            for(int k = nums.length - 1; k >= i + 1; k--)
            {
                product2 *= nums[k];
            }

            arr[i] = product1 * product2;
        }

        return arr;
    }
}  
