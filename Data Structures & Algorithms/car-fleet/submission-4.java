class Solution 
{
    public int carFleet(int target, int[] position, int[] speed) 
    {
        int n = position.length;
        //int[] times = new int[n];
        HashMap<Integer, Double> map = new HashMap<Integer, Double>();

        int num = 0;
        double fleetime = -1;

        for(int i = 0; i < n; i++)
        {
            if(!map.containsKey(position[i]))
            {
                double time = (target - position[i]) / (double) speed[i];
                map.put(position[i], time);
                //mintime = Math.min(mintime, time);
            }
            //times[i] = (target - position[i]) / speed[i];
        }

        Arrays.sort(position);
        

        for(int j = n - 1; j >= 0; j--)
        {
            if(map.get(position[j]) > fleetime)
            {
                num++;
                fleetime = map.get(position[j]);
            }
        }
        
        return num;

    }
}
