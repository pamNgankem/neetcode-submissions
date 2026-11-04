class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        for i in range(len(matrix)):
            l = 0
            r = len(matrix[i]) - 1

            while l <= r:
                mid = l + (r - l)//2

                if matrix[i][mid] == target:
                    return True
                elif target < matrix[i][mid]:
                    r = mid - 1
                else:
                    l = mid + 1

        return False