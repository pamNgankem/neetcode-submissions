class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        // indices storage
        int[] arr = new int[2];

        //finding pairs that add to target

        for(int i = 0; i < numbers.length; i++)
        {
            for(int j = 0; j < numbers.length; j++)
            {
                if(i != j && (numbers[i] + numbers[j] == target))
                {
                    arr[0] = j +1;
                    arr[1] = i + 1;
                    break;
                }
            }
        }
        
        return arr;
    }
}
