class Solution:
    def isPalindrome(self, s: str) -> bool:
        if not s:
            return False

        res = []
        s = s.lower()
        for c in s:
            if c.isalnum():
                res.append(c)

        return res == res[::-1]