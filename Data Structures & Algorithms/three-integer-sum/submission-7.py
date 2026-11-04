class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        s = set()
        nums.sort()

        for i in range(len(nums)):
            l = i+1
            r = len(nums) - 1

            while l < r:
                su = nums[i] + nums[l] + nums[r]

                if su == 0:
                    s.add(tuple([nums[i], nums[l], nums[r]]))
                    l += 1
                    r -= 1

                elif su < 0:
                     l += 1

                else:
                    r -= 1

        return list(s)