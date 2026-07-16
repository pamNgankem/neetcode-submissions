class Solution 
{
    public int search(int[] nums, int target) 
    {
        int l = 0;
        int r = nums.length - 1;

        int res = nums[0];

        while( l < r)
        {
            int mid = l + (r-l) / 2;
            res = Math.min(res, nums[mid]);

            if(nums[r] < nums[mid])
            {
                l = mid + 1;
            }
            else
            {
                r = mid;
            }
        }

        int inflexion = l;

        l = 0;
        r = inflexion - 1;

        while(l <= r)
        {
            int mid = l + (r - l) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }

        l = inflexion;
        r = nums.length - 1;

        while(l <= r)
        {
            int mid = l + (r - l) / 2;

            if(nums[mid] == target)
            {
                return mid;
            }
            else if(nums[mid] < target)
            {
                l = mid + 1;
            }
            else
            {
                r = mid - 1;
            }
        }

        return -1;
    }
}
