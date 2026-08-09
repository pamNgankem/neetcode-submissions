class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        if not heights:
            return []

        rows = len(heights)
        cols = len(heights[0])

        res = []

        def bfs(r, c):
            queue = deque()
            queue.append((r,c))
            visited = {(r,c)}

            pacific = False
            atlantic = False

            directions = [[1,0], [-1,0], [0,1], [0,-1]]

            while queue:
                ro, co = queue.popleft()

                if ro == 0 or co == 0:
                    pacific = True

                if ro == rows - 1 or co == cols - 1:
                    atlantic = True

                if pacific and atlantic:
                    return True

                for dr, dc in directions:
                    nr = ro + dr
                    nc = co + dc

                    if nr in range(rows) and nc in range(cols) and (nr,nc) not in visited and heights[nr][nc] <= heights[ro][co]:
                        queue.append((nr,nc))
                        visited.add((nr,nc))

            return pacific and atlantic 



        for row in range(rows):
            for col in range(cols):
                if bfs(row,col):
                    res.append([row,col])

        return res