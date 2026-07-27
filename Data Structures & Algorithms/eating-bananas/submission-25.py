class Solution:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        optimal = max(piles)

        l = 1
        r = optimal

        res = optimal

        while l <= r:
            rate = l + (r - l) // 2

            time = 0

            for j in range(len(piles)):
                time += math.ceil(piles[j] / rate)

            if time > h:
                l = rate + 1
            else:
                res = rate
                r = rate - 1

        return res
