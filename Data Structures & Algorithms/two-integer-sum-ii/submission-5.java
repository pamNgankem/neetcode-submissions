class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        // Convert array into hashmap, key = element and value = 1-index
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        for(int i = 1; i <= numbers.length; i++)
        {
            // compute the difference
            int diff = target - numbers[i - 1];

            // the complement of num[i] in the map
            if(map.containsKey(diff))
            {
                return new int[]{map.get(diff), i}; // we found a pair
            }
            else
            {
                map.put(numbers[i - 1], i);
            }
        }

        return new int[2];
    }
}
