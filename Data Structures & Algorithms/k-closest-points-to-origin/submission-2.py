class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        if not points:
            return []
        
        def getDistance(point):
            return math.sqrt(point[0]**2 + point[1]**2)

        max_heap = []

        for point in points:
            heapq.heappush(max_heap, (-getDistance(point), point))

            if len(max_heap) > k:
                heapq.heappop(max_heap)

        return [point for dist, point in max_heap]

