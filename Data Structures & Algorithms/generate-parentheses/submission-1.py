class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []

        def backtrack(path, num_open, num_close):
            if num_close > num_open or num_open > n:
                return
            
            if num_open == num_close and num_close == n:
                res.append("".join(path[:]))
                return

            path.append("(")
            backtrack(path, num_open + 1, num_close)
            path.pop()

            path.append(")")
            backtrack(path, num_open, num_close + 1)
            path.pop()

        backtrack([], 0, 0)
        return res