class Solution:
    def combinationSum2(self, candidates: List[int], target: int) -> List[List[int]]:
        if not candidates:
            return []

        candidates.sort()
        res = []

        def backtrack(idx, path, remaining):
            if remaining == 0:
                res.append(path[:])
                return

            for i in range(idx, len(candidates)):
                if i > idx and candidates[i] == candidates[i - 1] or candidates[i] > remaining:
                    continue
                path.append(candidates[i])
                backtrack(i+1, path, target - sum(path))
                path.pop()

        backtrack(0, [], target)
        return res
        