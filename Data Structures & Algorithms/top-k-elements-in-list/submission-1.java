class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        ArrayList<Integer>[] buckets = new ArrayList[nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
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

        for(int num : map.keySet())
        {
            int frequency = map.get(num);

            if(buckets[frequency] == null)
            {
                ArrayList<Integer> list = new ArrayList<Integer>();
                list.add(num);
                buckets[frequency] = list;
            }
            else
            {
                buckets[frequency].add(num);
            }
        }

        int[] arr = new int[k];
        int idx = 0;

        for(int j = buckets.length - 1; j >= 1 && idx < k; j--)
        {
            if(buckets[j] != null)
            {
               for(int i = 0; i < buckets[j].size() && idx < k; i++)
               {
                arr[idx] = buckets[j].get(i);
                idx++;
               }
            }
        }

        return arr;
    }
}
