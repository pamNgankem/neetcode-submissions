class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        HashSet<Integer> set = new HashSet<Integer>();

        int duplicate = 0;

        for(int num : nums)
        {
            if(set.contains(num))
            {
                duplicate = num;
                break;
            }
            else
            {
                set.add(num);
            }
        }

        return duplicate;
    }
}
