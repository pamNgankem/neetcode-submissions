class Solution 
{
    /*
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

        ArrayList<Integer> list = new ArrayList<Integer>();

        

        return arr;
    }
    */








    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < nums.length; i++)
        {
            int num = nums[i];
            if(!map.containsKey(num))
            {
                map.put(nums[i], 1);
            }
            else
            {
                map.put(num, map.get(num)+1);
            }
        }

        int[] arr = new int[k];
        int index = 0;

        for(int i = 0; i < k; i++)
        {
            int maxKey = 0;
            int max = 0;

            for(int key : map.keySet())
            {
                if(map.get(key) > max)
                {
                    max = map.get(key);
                    maxKey = key;
                }
            }

            arr[index] = maxKey;
            map.remove(maxKey);
            index++;
        }

        return arr;
    }

















}
