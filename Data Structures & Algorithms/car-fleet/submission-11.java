class Solution 
{
    public int carFleet(int target, int[] position, int[] speed) 
    {
        HashMap<Integer, Double> times = new HashMap<Integer, Double>();

        for(int i = 0; i < position.length; i++)
        {
            times.put(position[i], (target - position[i])/(double)speed[i]);
        }

        double fleetime = -1;
        int fleets = 0;

        Arrays.sort(position);

        for(int j = position.length - 1; j >= 0; j--)
        {
            if(times.get(position[j]) > fleetime)
            {
                fleets++;
                fleetime = times.get(position[j]);
            }
        }

        return fleets;
    }
}
