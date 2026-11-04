class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:

        l = 1
        optimal = max(piles)
        r = optimal
        res = optimal

        while l <= r:
            mid = l + (r - l) // 2

            time = 0

            for i in range(len(piles)):
                time += math.ceil(piles[i]/mid)

            if time <= h:
                res = mid
                r = mid - 1

            else:
                l = mid + 1

        return res


