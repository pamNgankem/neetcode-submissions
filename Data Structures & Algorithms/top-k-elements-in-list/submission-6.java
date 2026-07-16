class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {

        ArrayList<Integer>[] buckets = new ArrayList[nums.length+1];
        HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];

            if(!frequencies.containsKey(num))
            {
                frequencies.put(num, 1);
            }
            else
            {
                frequencies.put(num, frequencies.get(num)+1);
            }
        }

        for(int num : frequencies.keySet())
        {
            int freq = frequencies.get(num);

            if(buckets[freq] == null)
            {
                buckets[freq] = new ArrayList<Integer>();
            }
            buckets[freq].add(num);
        }

        int[] mostFreq = new int[k];
        int idx = 0;

        for(int j = buckets.length - 1; j >= 1 && idx < k; j--)
        {
            if(buckets[j] != null)
            {
                for(int i = 0; i < buckets[j].size() && idx < k; i++)
                {
                    mostFreq[idx] = buckets[j].get(i);
                    idx++;
                } 
            }
        }

        return mostFreq;
    }
}
