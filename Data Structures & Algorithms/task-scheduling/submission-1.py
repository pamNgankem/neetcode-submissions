class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:
        if not tasks:
            return 0

        frequencies = Counter(tasks)

        max_heap = [-freq for freq in frequencies.values()]

        heapq.heapify(max_heap)

        queue = deque()

        time = 0

        while queue or max_heap:
            time += 1

            if max_heap:
                maxi = -heapq.heappop(max_heap)
                maxi -= 1

                if maxi > 0:
                    queue.append([maxi, time + n])

            if queue and queue[0][1] == time:
                heapq.heappush(max_heap, -queue.popleft()[0])

        return time
