class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        if len(s2) < len(s1):
            return False

        s1_count = [0] * 26

        for c in s1:
            s1_count[ord(c) - ord('a')] += 1

        l = 0
        window_count = [0] * 26
        
        for r in range(len(s2)):
            window_count[ord(s2[r]) - ord('a')] += 1

            if (r - l + 1) > len(s1):
                window_count[ord(s2[l]) - ord('a')] -= 1
                l += 1

            if len(s1) == (r - l + 1):
                if s1_count == window_count:
                    return True

        return False