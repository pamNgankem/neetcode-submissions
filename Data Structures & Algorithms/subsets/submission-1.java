class Solution 
{
    public List<List<Integer>> subsets(int[] nums) 
    {
        /*
        Understand: return a list of all subsets of the current list
            input: list, output: list of lists
            edge cases: empty list, return an empty list

        Match: an really think of a pattern so far
        Plan:
            - have a set of lists since we do not want duplicate entries
            - add an empty list to the set
            - using nested for loops iterate over the nums and find all posible solutions/lists and add them tothe set
            _convert set into a list
        Implement: see below:
        Review: look for bugs to avoid compilation eror
        Evaualuate Space and time complexit:
        */
        if(nums.length == 0)
        {
            return new ArrayList<>();
        }

        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<>());

        for(int num : nums)
        {
            int size = res.size();
            for(int i = 0; i < size; i++)
            {
                List<Integer> ls = new ArrayList<Integer>(res.get(i));
                ls.add(num);
                res.add(ls);
            }
        }

        return res;
    }
}
