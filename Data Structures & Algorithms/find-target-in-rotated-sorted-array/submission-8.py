class Solution:
    def search(self, nums: List[int], target: int) -> int:
        res = nums[0]

        l = 0
        r = len(nums) - 1

        while l < r:

            mid = l + (r - l) // 2
            res = min(res, nums[mid])
            inflexion = mid

            if nums[r] < nums[mid]:
                l = mid + 1
            else:
                r = mid
                
        inflexion = l

        l = 0;
        r = inflexion - 1;

        while l <= r:
        
            mid = l + (r - l) // 2;

            if nums[mid] == target:
                return mid;
            elif nums[mid] < target:
                l = mid + 1;
            else:
                r = mid - 1;
        

        l = inflexion;
        r = len(nums) - 1

        while l <= r:
            mid = l + (r - l) // 2;

            if nums[mid] == target:
                return mid;
            elif nums[mid] < target:
                l = mid + 1;
            else:
                r = mid - 1;

        return -1;