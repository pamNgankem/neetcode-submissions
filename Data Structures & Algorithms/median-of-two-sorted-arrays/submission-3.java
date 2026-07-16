class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] arr = new int[nums1.length + nums2.length];

        int i = 0;
        int j = 0;
        int idx = 0;

        while(i < nums1.length && j < nums2.length)
        {
            if(nums1[i] < nums2[j])
            {
                arr[idx] = nums1[i];
                i++;
            }
            else
            {
                arr[idx] = nums2[j];
                j++;
            }

            idx++;
        }

        if(i != nums1.length)
        {
            while(i < nums1.length)
            {
                arr[idx] = nums1[i];
                idx++;
                i++;
            }
        }

        if(j != nums2.length)
        {
            while(j < nums2.length)
            {
                arr[idx] = nums2[j];
                idx++;
                j++;
            }
        }

        int n = arr.length;

        if(n % 2 != 0)
        {
            return arr[n/2];
        }
        else
        {
            return (arr[n/2] + arr[(n/2) - 1]) / 2.0;
        }
    }
}
