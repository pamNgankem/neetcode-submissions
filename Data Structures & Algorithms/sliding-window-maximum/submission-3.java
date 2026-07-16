class Solution 
{
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i <= nums.length - k; i++)
        {
            int max = nums[i];
            for(int j = i+1; j < i + k; j++)
            {
                max = Math.max(max, nums[j]);
            }

            list.add(max);
        }

        int[] arr = new int[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            arr[i] = list.get(i);
        }

        return arr;
    }
}
