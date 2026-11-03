class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        dic = Counter(nums)

        res = []

        for i in range(k):
            maX = float('-inf')
            maxKey = float('inf')

            for key in dic:
                if dic[key] > maX:
                    maxKey = key
                    maX = dic[key]

            res.append(maxKey)
            dic.pop(maxKey)

        return res