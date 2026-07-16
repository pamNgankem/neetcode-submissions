class Solution 
{
    public int[] twoSum(int[] numbers, int target) 
    {
        // indices storage
        int[] arr = new int[2];

        //finding pairs that add to target

        for(int i = 1; i <= numbers.length; i++)
        {
            for(int j = 1; j <= numbers.length; j++)
            {
                if(i != j && (numbers[i - 1] + numbers[j - 1] == target))
                {
                    arr[0] = j;
                    arr[1] = i;
                    break;
                }
            }
        }
        
        return arr;
    }
}
