class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        if not nums:
            return []

        num_zeros = 0
        product = 1

        for num in nums:
            if num != 0:
                product *= num
            else:
                num_zeros += 1

        if num_zeros > 1:
            return [0] * len(nums)

        res = [0] * len(nums)

        for i in range(len(nums)):
            if num_zeros > 0:
                if nums[i] != 0:
                    res[i] = 0
                else:
                    res[i] = product
            else:
                res[i] = product // nums[i]

        return res