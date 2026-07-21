class Solution:
    def lastStoneWeight(self, stones: List[int]) -> int:

        if not stones:
            return 0

        stones.sort()

        while len(stones) > 1:
            x = stones.pop(len(stones) - 2)
            y = stones.pop(len(stones) - 1)

            if x != y:
                stones.insert(self.getIndex(y-x, stones), y - x)
        if stones:
            return stones[0]
        else:
            return 0


    def getIndex(self, val:int, nums: List[int]):
        l = 0
        r = len(nums) - 1

        while l <= r:
            mid = (r + l) // 2

            if nums[mid] == val:
                return mid
            elif nums[mid] < val:
                l = mid + 1
            else:
                r = mid - 1

        return l
        