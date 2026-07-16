class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Set<ArrayList<Integer>> set = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 2; i++)
        {
            for(int j =  i + 1; j < nums.length - 1; j++)
            {
                for(int k = j + 1; k < nums.length; k++)
                {
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                        ArrayList<Integer> list1 = new ArrayList<Integer>();
                        list1.add(nums[i]);
                        list1.add(nums[j]);
                        list1.add(nums[k]);
                        set.add(list1);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
