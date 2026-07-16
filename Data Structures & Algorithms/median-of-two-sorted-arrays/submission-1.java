class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int[] arr = new int[nums1.length+nums2.length];

        int i = 0;

        while(i < nums1.length)
        {
            arr[i] = nums1[i];
            i++;
        }

        int j = 0;
        while(j < nums2.length)
        {
            arr[i] = nums2[j];
            i++;
            j++;
        }

        Arrays.sort(arr);

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
