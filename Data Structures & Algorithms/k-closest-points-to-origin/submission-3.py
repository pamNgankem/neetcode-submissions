class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        if not points or len(points) < k:
            return []

        def getDistance(point):
            return math.sqrt(point[0]**2 + point[1]**2)

        points.sort(key=getDistance)

        return points[:k]
        