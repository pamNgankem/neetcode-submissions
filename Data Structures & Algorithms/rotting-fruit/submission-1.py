class Solution:
    def orangesRotting(self, grid: List[List[int]]) -> int:
        if not grid:
            return -1

        rows = len(grid)
        cols = len(grid[0])

        EMPTY = 0
        FRESH = 1
        ROTTEN = 2

        queue = deque()
        fresh = 0

        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == ROTTEN:
                    queue.append((row,col))
                elif grid[row][col] == FRESH:
                    fresh += 1

        time_elapsed = 0

        directions = [[1,0], [-1,0], [0,-1], [0,1]]

        while queue and fresh > 0:
            level = len(queue)
            
            for _ in range(level):
                ro, co = queue.popleft()

                for dr, dc in directions:
                    nr = ro + dr
                    nc = co + dc

                    if nr in range(rows) and nc in range(cols) and grid[nr][nc] == FRESH:
                        grid[nr][nc] = ROTTEN
                        queue.append((nr,nc))
                        fresh -= 1

            time_elapsed += 1

        if fresh > 0:
            return -1

        return time_elapsed