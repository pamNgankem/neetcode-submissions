class Solution:
    def maxArea(self, heights: List[int]) -> int:
        maxA = float('-inf')

        l = 0
        r = len(heights) - 1

        while l < r:

            amount = (r-l) * min(heights[l], heights[r])
            maxA = max(maxA, amount)

            if heights[l] < heights[r]:
                l += 1
            else: 
                r -= 1

        return maxA
