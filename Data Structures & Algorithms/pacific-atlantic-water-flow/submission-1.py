class Solution:
    def pacificAtlantic(self, heights: List[List[int]]) -> List[List[int]]:
        if not heights:
            return []

        res = []

        rows = len(heights)
        cols = len(heights[0])

        directions = [[1,0], [-1,0], [0,1], [0,-1]]

        atlantic = set()
        pacific = set()

        pacific_queue = deque()
        atlantic_queue = deque()

        for col in range(cols):
            pacific_queue.append((0,col))
            pacific.add((0,col))

            atlantic_queue.append((rows - 1, col))
            atlantic.add((rows - 1, col))

        for row in range(rows):
            pacific_queue.append((row, 0))
            pacific.add((row,0))

            atlantic_queue.append((row, cols - 1))
            atlantic.add((row, cols - 1))

        def bfs(queue, reachable):

            while queue:
                ro, co = queue.popleft()

                for dr, dc in directions:
                    nr = ro + dr
                    nc = co + dc

                    if nr in range(rows) and nc in range(cols) and (nr,nc) not in reachable and heights[nr][nc] >= heights[ro][co]:
                        reachable.add((nr,nc))
                        queue.append((nr,nc))

        bfs(pacific_queue, pacific)
        bfs(atlantic_queue, atlantic)

        for (r,c) in pacific:
            if (r,c) in atlantic:
                res.append([r,c])

        return res
