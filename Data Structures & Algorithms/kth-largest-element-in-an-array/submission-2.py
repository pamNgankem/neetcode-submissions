class Solution:
    def findKthLargest(self, nums: List[int], k: int) -> int:
        if not nums or len(nums) < k:
            return 0

        nums.sort()

        return nums[len(nums) - k]