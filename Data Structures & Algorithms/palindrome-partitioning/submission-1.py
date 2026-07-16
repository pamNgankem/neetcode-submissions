class Solution:
    def partition(self, s: str) -> List[List[str]]:
        if not s:
            return []

        def is_palindrome(s):

            l = 0
            r = len(s) - 1

            while l < r:
                while l < r and not s[l].isalnum():
                    l += 1

                while l < r and not s[r].isalnum():
                    r -= 1 
                
                if s[l].lower() != s[r].lower():
                    return False

                l += 1
                r -= 1
            return True

        res = []

        def explore(idx, path):
            if idx >= len(s):
                res.append(path[:])
                return

            for end in range(idx, len(s)):
                if is_palindrome(s[idx:end+1]):
                    path.append(s[idx:end+1])
                    explore(end+1, path)
                    path.pop()

        explore(0, [])
        return res        