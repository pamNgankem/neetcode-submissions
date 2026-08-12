class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:
        stones.sort()

        def getIndex(val):
            l = 0
            r = len(stones) - 1

            while l <= r:
                mid = (r + l) // 2

                if stones[mid] == val:
                    return mid
                elif stones[mid] < val:
                    l = mid + 1
                else:
                    r = mid - 1
            return l

        while len(stones) > 1:
            y = stones.pop()
            x = stones.pop()

            if x < y:
                stones.insert(getIndex(y - x), y - x)

        return stones[0] if len(stones) > 0 else 0
