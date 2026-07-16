class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        int[] arr = new int[k];

        for(int i = 0; i < nums.length; i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
            }
            else
            {
                int num = map.get(nums[i]);
                map.put(nums[i], num + 1);
            }
        }

        for(int i = 0; i < k; i++)
        {
            int maxKey = 0;
            int max = 0;
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
