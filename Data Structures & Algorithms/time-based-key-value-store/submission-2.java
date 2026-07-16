class TimeMap 
{
    HashMap<String, ArrayList<Map.Entry<String, Integer>>> map;
    public TimeMap() 
    {
        map = new HashMap<String, ArrayList<Map.Entry<String, Integer>>>();
    }
    
    public void set(String key, String value, int timestamp) 
    {
        if(!map.containsKey(key))
        {
            map.put(key, new ArrayList<>());
        }

        ArrayList<Map.Entry<String, Integer>> list = map.get(key);

        Map.Entry<String, Integer> keyValuePair = new AbstractMap.SimpleEntry<>(value, timestamp);

        list.add(keyValuePair);
    }
    
    public String get(String key, int timestamp) 
    {
        if(!map.containsKey(key))
        {
            return "";
        }

        ArrayList<Map.Entry<String, Integer>> list = map.get(key);

        int left = 0;
        int right = list.size() - 1;

        int pos = -1;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            Map.Entry<String, Integer> entry = list.get(mid);
            int time = entry.getValue();

            if(time <= timestamp)
            {
                pos = mid;
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
            
        }

        if(pos == - 1)
        {
            return "";
        }
        else
        {
            return list.get(pos).getKey();
        }
    }
}
