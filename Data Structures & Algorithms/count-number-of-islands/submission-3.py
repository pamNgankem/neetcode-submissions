class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        num_islands = 0

        rows = len(grid)
        cols = len(grid[0])

        def bfs(r, c):
            queue = deque()
            queue.append((r, c))
            grid[r][c] = "0"

            while queue:
                ro, co = queue.popleft()

                directions = [[0, -1], [0, 1], [-1, 0], [1, 0]]

                for dr, dc in directions:
                    r = ro + dr
                    c = co + dc

                    if r in range(rows) and c in range(cols) and grid[r][c] == "1":
                        grid[r][c] = "0"
                        queue.append((r,c))

        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == "1":
                    bfs(row, col)
                    num_islands += 1

        return num_islands