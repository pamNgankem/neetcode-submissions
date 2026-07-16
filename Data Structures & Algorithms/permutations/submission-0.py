class Solution:
    def permute(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return []
        n = len(nums)
        res = []
        used = [False] * n 
        def backtrack(path):
            if len(path) == n:
                res.append(path[:])
                return

            for i in range(n):
                if used[i]:
                    continue
                path.append(nums[i])
                used[i] = True
                backtrack(path)
                used[i] = False
                path.pop()
        backtrack([])
        return res
