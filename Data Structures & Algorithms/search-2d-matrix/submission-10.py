class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        
        for row in range(len(matrix)):
            l = 0
            r = len(matrix[0]) - 1

            while l <= r:
                mid = l + (r-l) // 2

                if matrix[row][mid] == target:
                    return True
                elif matrix[row][mid] < target:
                    l = mid + 1
                else:
                    r = mid - 1

        return False