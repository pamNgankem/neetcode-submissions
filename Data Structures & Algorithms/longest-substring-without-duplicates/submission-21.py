class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        best = 0
        uni = set()

        for r in range(len(s)):
            while s[r] in uni:
                uni.remove(s[l])
                l += 1
            uni.add(s[r])
            best = max(best, r - l + 1)

        return best