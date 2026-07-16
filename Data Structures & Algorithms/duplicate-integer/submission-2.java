class Solution {
    public boolean hasDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();
        
        for(int num : nums)
        {
            if(seen.containsKey(num))
            {
                return true;
            }
            else
            {
                seen.put(num, 1);
            }
        }
        return false;
    }
}