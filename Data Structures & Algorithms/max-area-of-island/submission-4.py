class Solution:
    def maxAreaOfIsland(self, grid: List[List[int]]) -> int:
        """
        Understand: were given a grid/graphs made of islaands surrounded by water 
                    and we want to return the area of the biggest island
                    input: 2d list/matrix
                    output: integer
                    edge cases: empty grid, no islands therefore no area
        Match: Breath first search to search for islands and thier area
        PLAN: - empty grid -> 0
              - get the number of rows and colums in the grid
              - have a variable to keep track of the maximum island's area seen so far
              - iterate over the grid considering every ceel containing 1 as a potential island border
                - create a variable for the area of the current island
                - use bfs to visit/search all the other lands in the current island and update the
                  current area
                - update the maximum area 
              -return the maximum area
        Implement: See below
        """

        if not grid:
            return 0

        rows = len(grid)
        cols = len(grid[0])

        max_area = 0 # area of the biggest island

        def bfs(r, c):
            queue = deque()
            queue.append((r,c))
            grid[r][c] = 0
            area = 1

            while queue:
                ro, co = queue.popleft()

                directions = [[0, 1], [0, -1], [1, 0], [-1, 0]] # neighbors of the current land

                #visit neighbor lands
                for dr, dc in directions:
                    r = ro + dr
                    c = co + dc

                    if r in range(rows) and c in range(cols) and grid[r][c] == 1:
                        area += 1 # another land belonging to the current island
                        queue.append((r,c))
                        grid[r][c] = 0

            return area

        for row in range(rows):
            for col in range(cols):
                if grid[row][col] == 1: #a land potential border of an island
                    area = bfs(row, col) # area of the current island
                    max_area = max(max_area, area)

        return max_area
