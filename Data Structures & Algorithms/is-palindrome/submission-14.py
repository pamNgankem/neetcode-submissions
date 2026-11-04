class Solution:
    def isPalindrome(self, s: str) -> bool:
        t = ""

        for i in range(len(s)):
            if s[i].isalnum():
                t += s[i].lower()

        t_reversed = ''.join(reversed(t))
        return t_reversed == t