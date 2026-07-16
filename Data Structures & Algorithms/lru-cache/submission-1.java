class LRUCache 
{
    int[][] lruCache;
    int count = 0;
    int timer = 0; // global ever-increasing counter

    public LRUCache(int capacity) 
    {
        lruCache = new int[capacity][3]; // [key, value, timestamp]
    }

    public int get(int key) 
    {
        for (int i = 0; i < count; i++) 
        {
            if (lruCache[i][0] == key) 
            {
                lruCache[i][2] = timer++; // mark as most recently used
                return lruCache[i][1];
            }
        }
        return -1;
    }

    public void put(int key, int value) 
    {
        // Update if key already exists
        for (int i = 0; i < count; i++) 
        {
            if (lruCache[i][0] == key) 
            {
                lruCache[i][1] = value;
                lruCache[i][2] = timer++;
                return;
            }
        }

        // Evict LRU entry if at capacity (lowest timestamp)
        if (count == lruCache.length) 
        {
            int lruIndex = 0;
            for (int i = 1; i < count; i++) 
            {
                if (lruCache[i][2] < lruCache[lruIndex][2]) 
                {
                    lruIndex = i;
                }
            }

            lruCache[lruIndex][0] = key;
            lruCache[lruIndex][1] = value;
            lruCache[lruIndex][2] = timer++;
        } 
        else 
        {
            lruCache[count][0] = key;
            lruCache[count][1] = value;
            lruCache[count][2] = timer++;
            count++;
        }
    }
}
