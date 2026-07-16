class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int sum = 0;
        int[] arr = new int[2];

        for(int i = 0; i < nums.length - 1; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                sum = nums[i] + nums[j];
                if(sum == target && i != j)
                {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }

        return arr;
    }
}
