class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        if not nums:
            return []

        res = []

        def backtrack(idx, path):
            if sum(path) == target:
                res.append(path[:])
            
            for i in range(idx, len(nums)):
                if nums[i] > target - sum(path):
                    continue
                
                path.append(nums[i])
                backtrack(i, path)
                path.pop()
        backtrack(0, [])
        return res
        
        