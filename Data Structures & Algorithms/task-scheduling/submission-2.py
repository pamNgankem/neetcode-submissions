class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        
        if not tasks:
            return 0

        frequencies = Counter(tasks)

        max_heap = [-freq for freq in frequencies.values()]

        heapq.heapify(max_heap)

        time = 0

        queue = deque()

        while queue or max_heap:
            time += 1 # process a task

            if max_heap:
                current = -heapq.heappop(max_heap) #most frequent task

                current -= 1 # task used so get remaining occurences

                if current > 0:
                    queue.append([current, time + n]) # task waits for the n cycle before being used again

            if queue and queue[0][1] == time:
                heapq.heappush(max_heap, -queue.popleft()[0]) # n cycle completed, this task can be processed

        return time
