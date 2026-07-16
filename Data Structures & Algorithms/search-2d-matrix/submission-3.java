class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        for(int row = 0; row < matrix.length; row++)
        {
            int left = 0;
            int right = matrix[row].length - 1;

            while(left <= right)
            {
                int mid = left + (right - left)/2;
                if(matrix[row][mid] == target)
                {
                    return true;
                }
                else if (target < matrix[row][mid])
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }
        }

        return false;
        
    }
}
