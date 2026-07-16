class TimeMap 
{
    HashMap<String, ArrayList<Map.Entry<String, Integer>>> map = new HashMap<String,ArrayList<Map.Entry<String, Integer>>>();

    public TimeMap() 
    {

        map = new HashMap<String,ArrayList<Map.Entry<String, Integer>>>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
        if(!map.containsKey(key))
        {
            map.put(key, new ArrayList<>());
        }
        
        (map.get(key)).add(new AbstractMap.SimpleEntry<>(value, timestamp));
        
    }
    
    public String get(String key, int timestamp) 
    {
        if(!map.containsKey(key))
        {
            return "";
        }

        ArrayList<Map.Entry<String, Integer>> list = map.get(key);
        
        int left = 0;
        int right =  list.size() - 1;
        int pos = -1;

        while(left <= right)
        {
            int mid = left + (right - left)/2;
            Map.Entry<String, Integer> entry = list.get(mid);
            int val = entry.getValue();

            if(val <= timestamp)
            {
                pos = mid;
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }

        }

        if(pos == -1)
        {
            return "";
        }
        else
        {
            return (list.get(pos)).getKey();
        }
        
        
    }
}
