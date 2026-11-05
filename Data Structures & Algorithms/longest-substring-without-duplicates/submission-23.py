class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        maxL = 0

        seen = set()

        l, r = 0, 0

        while r < len(s):
            # this char is already in the window
            while s[r] in seen:
                seen.remove(s[l]) # remove char from the window
                l += 1 # shrink window

            seen.add(s[r])
            maxL = max(maxL, r - l + 1) #extend window
            r += 1

        return maxL


