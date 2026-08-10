class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        indegrees = [0] * numCourses

        adj = defaultdict(list)
        res = []

        for course, prereq in prerequisites:
            adj[prereq].append(course)
            indegrees[course] += 1

        queue = deque()

        for course in range(numCourses):
            if indegrees[course] == 0:
                queue.append(course)

        while queue:
            course = queue.popleft()
            res.append(course)

            for preq in adj[course]:
                indegrees[preq] -= 1
                if indegrees[preq] == 0:
                    queue.append(preq)

        return res if len(res) == numCourses else []