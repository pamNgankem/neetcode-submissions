class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {

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

        int count = 0;
        int[] mostfreq = new int[k];

        for(int j = 0; j < k; j++)
        {
            int max = 0;
            int maxNum = 0;

            for(int num : frequencies.keySet())
            {
                if(frequencies.get(num) > max)
                {
                    max = frequencies.get(num);
                    maxNum = num;
                }
            }

            mostfreq[count] = maxNum;
            count++;
            frequencies.remove(maxNum);
        }
        
        return mostfreq;
    }
}
