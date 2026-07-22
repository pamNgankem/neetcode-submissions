class Solution:
    def leastInterval(self, tasks: List[str], n: int) -> int:

        freq = [0] * 26
        for task in tasks:
            freq[ord(task) - ord('A')] += 1

        pq = [-f for f in freq if f > 0]
        heapq.heapify(pq)

        time = 0
        
        while pq:
            cycle = n + 1
            task_count = 0
            store = []

            while cycle > 0 and pq:
                current_task = -heapq.heappop(pq)

                if current_task > 1:
                    store.append(-(current_task - 1))

                cycle -= 1
                task_count += 1

            for f in store:
                heapq.heappush(pq, f)

            time += task_count if not pq else n+1

        return time
        