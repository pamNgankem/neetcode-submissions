class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if not nums:
            return 0

        maxLength = float('-inf')
        st = set(nums)

        for num in st:
            if num - 1 in st:
                continue

            length = 1

            while num + length in st:
                length += 1

            maxLength = max(maxLength, length)

        return maxLength

            