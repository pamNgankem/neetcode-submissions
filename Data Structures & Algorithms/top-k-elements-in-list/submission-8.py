class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        buckets = [[] for i in range(len(nums) + 1)]

        dic = Counter(nums)

        for key in dic:
            buckets[dic[key]].append(key)

        j = len(buckets) - 1
        t = 0

        res = []

        while j >= 1 and t < k:
            p = 0
            
            while p < len(buckets[j]) and t < k:
                res.append(buckets[j][p])
                p += 1
                t += 1

            j -= 1

        return res