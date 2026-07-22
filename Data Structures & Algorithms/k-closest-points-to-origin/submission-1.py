class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        if not points or len(points)< k:
            return []

        points.sort(key = self.distance)

        return points[:k]

    def distance(self, point:List[int]) -> int:
        return math.sqrt(point[0]**2 + point[1]**2)