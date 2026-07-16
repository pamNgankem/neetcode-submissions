class Solution 
{
    public int longestConsecutive(int[] nums) 
    {
        Set<Integer> set = new TreeSet<Integer>();

        for(int num : nums)
        {
            set.add(num);
        }

        Integer[] nums1 = set.toArray(new Integer[0]);
        int count = 0;

        for(int i = 0; i < nums1.length; i++)
        {
            int ind = i;
            ArrayList<Integer> tempArr = new ArrayList<Integer>();
            tempArr.add(nums1[ind]);
            for(int j = ind + 1; j < nums1.length; j++)
            {
                if(nums1[j] - nums1[ind] == 1)
                {
                    tempArr.add(nums1[j]);
                    ind++;
                }
                else
                {
                    break;
                }
            }

            if(tempArr.size() > count)
            {
                count = tempArr.size();
            }

        }

        return count;
    }
}
