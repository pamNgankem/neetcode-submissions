class Solution 
{
    public List<List<Integer>> threeSum(int[] nums) 
    {
        //[-4,-1,-1,0,1,2]

        Arrays.sort(nums);
        Set<ArrayList<Integer>> set = new HashSet<>();

        for(int i = 0; i < nums.length - 1; i++)
        {
            int left = i + 1;
            int right = nums.length - 1;

            while(left < right)
            {
                int sum = nums[left] + nums[right] + nums[i];
                int target = 0;
                if(sum == target)
                {
                    ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(nums[i], nums[left], nums[right]));
                    //list.add(nums[i], nums[left], nums[right]);
                    set.add(list);
                    left++;
                    right--;
                }
                else if(sum < target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
                
            }
        }

        return new ArrayList<>(set);
    }
}
