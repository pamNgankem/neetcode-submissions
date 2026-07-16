class Solution 
{
    public int findMin(int[] nums) 
    {
        //int min = nums[0];

        int i = 0;
        while(i < nums.length - 1 && nums[i] < nums[i+1])
        {
            i++;
        }

        if(i == nums.length - 1)
        {
            return nums[0];
        }
        else
        {
            return nums[i+1];
        }
    }
}
