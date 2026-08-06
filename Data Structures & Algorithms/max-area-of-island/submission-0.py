class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        if not grid:
            return 0

        max_area = 0

        rows = len(grid)
        cols = len(grid[0])

        def bfs(r, c, ar):
            queue = deque()
            queue.append((r,c))
            grid[r][c] = 0

            while queue:
                ro, co = queue.popleft()

                directions = [[1, 0], [-1, 0], [0, 1], [0, -1]]

                for dr, dc in directions:
                    r = ro + dr
                    c = co + dc

                    if r in range(rows) and c in range(cols) and grid[r][c] == 1:
                        grid[r][c] = 0
                        queue.append((r,c))
                        ar[0] += 1

        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == 1:
                    area = [1]
                    bfs(row, col, area)
                    max_area = max(max_area, area[0])


        return max_area