class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
        Set<List<Integer>> lists = new HashSet<>();

        for(int i = 0; i < nums.length; i++)
        {
            int l = i + 1;
            int r = nums.length - 1;

            while(l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0)
                {
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    lists.add(list);
                    l++;
                    r--;
                }
                else if ( sum < 0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }

        return new ArrayList<>(lists);
    }
}
