class Solution 
{
    List<List<Integer>> list = new ArrayList<>();
    int[] nums;

    public List<List<Integer>> subsets(int[] nums) 
    {
        this.nums = nums;
        List<Integer> current = new ArrayList<>();
        backtrack(0, current);
        return list;
    }

    public void backtrack(int index, List<Integer> curr)
    {
        if(index == nums.length)
        {
            list.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        backtrack(index + 1, curr);
        curr.remove(curr.size() - 1);
        backtrack(index+1, curr);
    }
}
