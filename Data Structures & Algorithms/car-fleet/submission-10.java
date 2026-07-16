class Solution 
{
    public int carFleet(int target, int[] position, int[] speed) 
    {
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();

        for(int i = 0; i < position.length; i++)
        {
            double time = (target - position[i]) / (double) speed[i];
            map.put(position[i], time);
        }

        Arrays.sort(position);

        double fleeTime = -1;
        int numCarFleet = 0;

        for(int i = position.length - 1; i >= 0; i--)
        {
            if(map.get(position[i]) > fleeTime)
            {
                numCarFleet++;
                fleeTime = map.get(position[i]);
                
            }
        }

        return numCarFleet;
        
    }
}
