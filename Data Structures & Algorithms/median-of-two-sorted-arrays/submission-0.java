class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] nums = new int[nums1.length + nums2.length];

        int i = 0;
        while(i < nums1.length)
        {
            nums[i] = nums1[i];
            i++;
        }

        for(int j = 0; j < nums2.length; j++)
        {
            nums[i] = nums2[j];
            i++;
        }

        Arrays.sort(nums);

        if(nums.length % 2 != 0)
        {
            return nums[nums.length/2];
        }
        else
        {
            int middle = nums.length/ 2;
            return (nums[middle] + (double)nums[middle - 1])/2;
        }
    }
}