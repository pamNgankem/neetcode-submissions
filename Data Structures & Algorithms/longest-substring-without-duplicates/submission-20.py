class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        l = 0
        best = 0

        dictio = defaultdict(int)

        for r in range(len(s)):
            dictio[s[r]] += 1

            while dictio[s[r]] > 1:
                dictio[s[l]] -= 1
                l += 1

            best = max(best, r - l + 1)

        return best