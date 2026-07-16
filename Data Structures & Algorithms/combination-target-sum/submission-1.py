class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        if not nums:
            return []
        
        res = []

        def backtrack(idx, path, remaining):
            if remaining == 0:
                res.append(path[:])

            for i in range(idx, len(nums)):
                if nums[i] > remaining:
                    continue
                path.append(nums[i])
                backtrack(i, path, target - sum(path))
                path.pop()

        backtrack(0, [], target)
        return res
        