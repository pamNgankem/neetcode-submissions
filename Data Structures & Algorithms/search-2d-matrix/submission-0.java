class Solution 
{
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        for(int i = 0; i < matrix.length; i++)
        {
            int left = 0;
            int right = matrix[i].length;

            while(left < right)
            {
                int mid = ((right + left) / 2);
                if(matrix[i][mid] == target)
                {
                    return true;
                }
                else if(matrix[i][mid] < target)
                {
                    left = mid + 1;
                }
                else
                {
                    right = mid;
                }
            }
        }

        return false;
    }
}
