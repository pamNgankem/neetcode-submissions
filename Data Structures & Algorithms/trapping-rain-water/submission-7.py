class Solution:
    def trap(self, height: List[int]) -> int:
        maxA = 0

        n = len(height)

        for i in range(n):
            mL = height[0]
            mR = height[n-1]
            
            l = i
            r = i

            while l >= 0:
                if height[l] > mL:
                    mL = height[l]
                l -= 1 

            while r < n:
                if height[r] > mR:
                    mR = height[r]
                r += 1 

            waterLevel = abs(height[i] - min(mL, mR))
            maxA += waterLevel

        return maxA