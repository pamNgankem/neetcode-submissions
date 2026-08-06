class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if not grid:
            return 0

        rows = len(grid)
        cols = len(grid[0])
        max_area = 0

        def dfs(r, c):
            if not r in range(rows) or not c in range(cols) or grid[r][c] != 1:
                return 0
            
            area = 1
            grid[r][c] = 0

            area += dfs(r - 1, c)
            area += dfs(r + 1, c)
            area += dfs(r, c - 1)
            area += dfs(r, c + 1)

            return area

        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == 1:
                    area = dfs(row,col)
                    max_area = max(max_area, area)

        return max_area