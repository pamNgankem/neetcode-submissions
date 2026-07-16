class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
        int[] arr = new int[k];
        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1); 
            }
            else
            {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        for(int i = 0; i < k; i++)
        {
            int max = 0;
            int maxKey = 0;

            for(int key : map.keySet())
            {
                if(map.get(key) > max)
                {
                    maxKey = key;
                    max = map.get(key);
                }
            }
            arr[i] = maxKey;
            map.remove(maxKey);
        }

        return arr;
    }
}
