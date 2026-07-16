class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        if(nums.length == 0)
        {
            return nums.length;
        }
        TreeSet<Integer> set = new TreeSet<Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            set.add(nums[i]);
        }

        if(set.size() == 1)
        {
            return 1;
        }

        int[] arr = new int[set.size()];

        int i = 0;

        for(int s : set)
        {
            arr[i] = s;
            i++;
        }

        int maxLength = 0;

        for(int j = 0; j < arr.length - 1; j++)
        {
            int l = j;
            int length = 0;
            for(int k =  l + 1; k < arr.length && l < arr.length - 1; k++)
            {
                if(arr[k] - arr[l] == 1)
                {
                    length++;
                    l = k;
                }
                else
                {
                    break;
                }
            }

            length++;

            maxLength = Math.max(length, maxLength);
        }

        return maxLength;
        
    }
}
