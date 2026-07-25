class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        best = 0

        for i in range(len(s)):
            for j in range(i, len(s)):
                if len(s[i:j+1]) != len(set(s[i:j+1])):
                    break
                else:
                    best = max(best, len(s[i:j+1]))

        return best