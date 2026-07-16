class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        for(int row = 0; row < matrix.length; row++)
        {
            if(search(matrix[row], target) != -1)
            {
                return true;
            }
        }

        return false;
        
    }

    public int search(int[] nums, int target) 
    {
        int left = 0;
        int right = nums.length - 1;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if (target < nums[mid])
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return -1;
    }
}
