class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        max_heap = []

        for weight in stones:
            heapq.heappush(max_heap, -weight)

        while len(max_heap) >= 2:
            y = -heapq.heappop(max_heap)
            x = -heapq.heappop(max_heap)

            if x < y:
                heapq.heappush(max_heap, -(y - x))
                
        return -max_heap[0] if max_heap else 0
