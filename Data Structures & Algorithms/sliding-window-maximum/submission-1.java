class Solution 
{
    public int[] maxSlidingWindow(int[] nums, int k) 
    {
        // stores all windows' max values
        ArrayList<Integer> list = new ArrayList<Integer>();

        // checking all the windows of size k from nums
        for(int i = 0; i <= nums.length - k; i++)
        {
            // stores window's maximum element
            int max = nums[i];

            //start looking for the maximum in the current window
            for(int j = i+1; j < i + k; j++)
            {
                // update max value when a bigger value is found
                max = Math.max(max, nums[j]);
            }

            // add max element to the list
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
