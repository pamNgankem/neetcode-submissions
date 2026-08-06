class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        if not grid:
            return 0

        visited = set()

        num_islands = 0

        rows = len(grid)
        cols = len(grid[0])

        def bfs(r,c):
            queue = deque()

            queue.append((r,c))
            visited.add((r,c))

            while queue:
                ro, co = queue.popleft()
                directions = [[-1, 0], [1, 0], [0, -1], [0, 1]]

                for dr, dc in directions:
                    r = ro + dr
                    c = co + dc

                    if r in range(rows) and c in range(cols) and (r,c) not in visited and grid[r][c] == "1":
                            visited.add((r,c))
                            queue.append((r,c)) 

        for row in range(rows):
            for col in range(cols):
                if (row, col) not in visited and grid[row][col] == "1":
                    bfs(row,col)
                    num_islands += 1

        return num_islands
