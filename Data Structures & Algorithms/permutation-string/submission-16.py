class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s2) < len(s1):
            return False

        l = 0
        r = 0

        countS1 = [0] * 26

        for c in s1:
            countS1[ord(c) - ord('a')] += 1

        windowCount = [0] * 26
        
        while r < len(s2):
            windowCount[ord(s2[r]) - ord('a')] += 1
            
            if (r - l + 1) > len(s1):
                windowCount[ord(s2[l]) - ord('a')] -= 1
                l += 1

            if len(s1) == (r - l + 1):
                if countS1 == windowCount:
                    return True

            r += 1

        return False
            