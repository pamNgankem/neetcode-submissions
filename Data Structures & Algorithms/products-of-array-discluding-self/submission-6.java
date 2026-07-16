class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {

        int[] res = new int[nums.length];

        for(int i = 0; i < nums.length; i++)
        {
            res[i] = 1;
            int prefix = 1;
            int j = i - 1;

            while(j>= 0)
            {
                prefix *= nums[j];
                j--;
            }
            
            res[i] = prefix;
        }


        for(int i = 0; i < nums.length; i++)
        {
            int postfix = 1;
            int j = i + 1; 

            while(j < nums.length)
            {
                postfix *= nums[j];
                j++;
            }

            res[i] *= postfix;
        }
        
        return res;
    }
}  
